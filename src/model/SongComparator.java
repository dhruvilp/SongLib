/**
 * @description CS 213 Project 1
 * @author Dhruvil Patel <dhp68>
 * @author Nicholas Bonura <njb127>
 */

package model;

import java.util.Comparator;
import model.Song;

public class SongComparator implements Comparator<Song>{

	@Override
	public int compare(Song s1, Song s2) {
		return s1.getTitle().toLowerCase()
				.compareTo(s2.getTitle().toLowerCase());
	}
}

