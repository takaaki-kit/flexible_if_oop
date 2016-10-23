require 'rails_helper'

describe 'ログイン' do
  it do
    visit root_path
    expect(page.body).to include('ログイン')
  end
end
