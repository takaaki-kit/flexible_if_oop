class HomeController < ApplicationController

  def index
    unless session[:user_name]
      redirect_to new_session_url
    end
  end
end
