package practice;

import java.util.*;

class Activity {
    int start;
    int finish;

    // Constructor to initialize activity with start and finish times
    public Activity(int start, int finish) {
        this.start = start;
        this.finish = finish;
    }

    @Override
    public String toString() {
        return "(" + start + ", " + finish + ")";
    }
}

public class ActivitySelection {

    public static List<Activity> activitySelection(Activity[] activities) {
        // Step 1: Sort activities based on their finish times
        Arrays.sort(activities, Comparator.comparingInt(a -> a.finish));

        // Step 2: Select the first activity
        List<Activity> selectedActivities = new ArrayList<>();
        selectedActivities.add(activities[0]);
        
        // Step 3: Iterate over the remaining activities and select the ones that do not overlap
        int lastFinishTime = activities[0].finish;
        
        for (int i = 1; i < activities.length; i++) {
            // If the start time of the current activity is greater than or equal to the finish time of the last selected activity
            if (activities[i].start >= lastFinishTime) {
                selectedActivities.add(activities[i]);
                lastFinishTime = activities[i].finish; // Update lastFinishTime to the finish time of the current activity
            }
        }
        
        return selectedActivities;
    }

    public static void main(String[] args) {
        // Example: Array of activities with start and finish times
        Activity[] activities = {
            new Activity(1, 3),
            new Activity(2, 5),
            new Activity(4, 6),
            new Activity(6, 8),
            new Activity(5, 7),
            new Activity(8, 9)
        };
        
        // Get the list of selected activities
        List<Activity> selectedActivities = activitySelection(activities);
        
        // Output the selected activities
        System.out.println(selectedActivities);  // Output: [(1, 3), (4, 6), (8, 9)]
    }
}

// Time: Sorting: O(n log n)
// Space: Iterating and selecting activities: O(n)