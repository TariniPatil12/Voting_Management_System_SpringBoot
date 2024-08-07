package com.example.Voting_System.services;

import java.util.List;

import com.example.Voting_System.entity.Voter;

public interface VoterService {

	List<Voter> voterlist();

	Voter findById(int id);

	Voter saveVoter(Voter voter);

	Voter updateVoter(Voter voter);

	void deleteById(int id);
}
