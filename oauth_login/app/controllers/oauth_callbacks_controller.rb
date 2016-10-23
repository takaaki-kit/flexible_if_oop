class OauthCallbacksController < ApplicationController

  def create
    users = User.where(uid: '1234567890')
    if users.any?
      session[:user_name] = users[0].name
    else
      new_user = User.create!(uid: '1234567890', name: 'ユーザの名前', email: 'user@gmail.com')
      session[:user_name] = new_user.name
    end
    redirect_to root_url
  end
end
