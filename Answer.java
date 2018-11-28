package hackerrank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Answer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final List<Meeting> meetings = Arrays.asList(new Meeting(1, 10), new Meeting(2, 6), new Meeting(3, 5), new Meeting(7, 9));
		System.out.println(mergeRanges(meetings));
	}
	
    public static List<Meeting> mergeRanges(List<Meeting> meetings) {
        ArrayList<Meeting> result = new ArrayList<Meeting>();
        ArrayList<Meeting> removeMeetings = new ArrayList<Meeting>();
        
        int count = 1;
        // merge meetings ranges

        for(int i = 0; i < meetings.size(); i++) {
            Meeting meeting = meetings.get(i);
            int meetingStartTime = meeting.getStartTime();
            int meetingEndTime = meeting.getEndTime();
            
            for(int j = i + 1; j < meetings.size(); j++) {
                Meeting currentMeeting = meetings.get(j);
                int currentStartTime = currentMeeting.getStartTime();
                int currentEndTime = currentMeeting.getEndTime();
                
                if(currentStartTime <= meetingEndTime && currentEndTime >= meetingStartTime) {
                    meetingStartTime = (meetingStartTime < currentStartTime) ? meetingStartTime : currentStartTime;
                    meetingEndTime = (meetingEndTime > currentEndTime) ? meetingEndTime : currentEndTime;
                    removeMeetings.add(currentMeeting);
                    count++;
                }
            }
            
            result.add(new Meeting(meetingStartTime, meetingEndTime));
            
            if(count == meetings.size()) {
                break;
            }
            // System.out.println(result);
        }
        result.removeAll(removeMeetings);
        
        // sort the result array by the start time.
        Collections.sort(result, new Comparator<Meeting>() {
            @Override
            public int compare(Meeting m1, Meeting m2) {
                return m1.getStartTime() - m2.getStartTime();
            }
        });
        return result;
    }

}
