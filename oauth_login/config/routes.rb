Rails.application.routes.draw do
  # For details on the DSL available within this file, see http://guides.rubyonrails.org/routing.html
  match   '/auth/:provider/callback', to: 'oauth_callbacks#create', via: [:get, :post], as: :oauth_callbacks

  get 'session/new', to: 'sessions#new', as: :new_session

  root 'home#index'

  #めんどくて適当に作ってるので参考にしないこと
  get 'logout', to: 'sessions#logout', as: :logout
end
