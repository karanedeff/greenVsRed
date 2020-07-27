package com.mentormate.devops.greenVsRed.components.interfaces;

import com.mentormate.devops.greenVsRed.components.GameGridIterator;

public interface GenerationRules {
	public boolean isAlive(GameGridIterator iterator);
}
