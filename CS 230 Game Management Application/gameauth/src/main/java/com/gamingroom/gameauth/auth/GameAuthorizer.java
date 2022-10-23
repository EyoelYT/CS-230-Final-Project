package com.gamingroom.gameauth.auth;

import io.dropwizard.auth.Authorizer;

// Matches roles and decides whether user is allowed to perform certain action or not.
public class GameAuthorizer implements Authorizer<GameUser> 
{
    @Override
    public boolean authorize(GameUser user, String role) {
    	return user.getRoles() != null && user.getRoles().contains(role);
    }
    	
}