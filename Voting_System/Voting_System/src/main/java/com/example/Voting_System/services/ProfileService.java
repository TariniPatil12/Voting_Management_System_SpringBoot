package com.example.Voting_System.services;

import com.example.Voting_System.entity.Profile;

public interface ProfileService {

	Profile setProfile(Profile profile);

	Profile getById(int id);

	Profile existById(int id);
}
