class SessionsController < ApplicationController

  def new
    if session[:user_name]
      redirect_to root_url
    end
  end

  #めんどくて適当に作ってるので参考にしないこと
  def logout
    session.delete(:user_name)
    redirect_to new_session_url
  end
end
