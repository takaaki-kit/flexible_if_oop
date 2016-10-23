class OauthCallbacksController < ApplicationController

  def create
    auth_hash = request.env['omniauth.auth']
    uid = auth_hash['uid']
    users = User.where(uid: uid)
    if users.any?
      session[:user_name] = users[0].name
    else
      info = auth_hash['info']
      new_user = User.create!(uid: uid, name: info['name'], email: info['email'])
      session[:user_name] = new_user.name
    end
    redirect_to root_url
  end
end
