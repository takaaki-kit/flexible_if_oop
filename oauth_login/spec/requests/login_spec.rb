require 'rails_helper'

describe 'GET /auth/google/callback' do
  before do
    OmniAuth.config.add_mock(
      :google,
      {
        'provider' => 'google',
        'uid' => '1234567890',
        'info' => {
          'email' => 'user@gmail.com',
          'name' => 'ユーザの名前',
        },
      },
    )
    Rails.application.env_config['omniauth.auth'] = OmniAuth.config.mock_auth[:google]
  end

  context '新規でログインする場合' do
    it 'ログイン状態でかつ新しく登録されていること' do
      expect {
        get(oauth_callbacks_path(provider: :google))
        follow_redirect!
      }.to change { User.count }.from(0).to(1)
      expect(response.body).to include('ユーザの名前')
    end
  end

  context 'すでに登録済みのユーザの場合' do
    it 'ログイン状態になっていること' do
      User.create!(uid: '1234567890', name: 'ユーザの名前', email: 'user@gmail.com')
      expect {
        get(oauth_callbacks_path(provider: :google))
        follow_redirect!
      }.to change { User.count }.by(0)
      puts User.all
      expect(response.body).to include('ユーザの名前')
    end
  end
end
