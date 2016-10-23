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
    get(oauth_callbacks_path(provider: :google))
    follow_redirect!
  end

  it 'ログイン状態になっていること' do
    expect(response.body).to include('ユーザの名前')
  end
end
