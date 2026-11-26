package nl.saxion.game.yourgamename;

import java.util.*;

import static com.badlogic.gdx.math.MathUtils.random; // To get a random event from possible events.

public class StoryStateManager {

    // Some placeholder events with their indexes.
    final int EVENT_1 = 0;
    final int EVENT_2 = 1;
    final int EVENT_3 = 2;
    // I guess makes sense to add endings here as well.

    final int TOTAL_EVENTS = 3;
    final int TOTAL_DAYS = 14;

    int[] currentStoryPoint = new int[TOTAL_EVENTS];
    int[] totalStoryPoints = {3, 3, 3}; // How many storypoints in each event according to event index.
    boolean[] isRejected = new boolean[TOTAL_EVENTS]; // Is true for every rejected story or for stories that require more days to finish than days left.
    boolean[] happenedToday = new boolean[TOTAL_EVENTS];

    int currentDay = 1;
    boolean rejectedTheLastStory = false;
    String ending = "";

    public int getRandomEvent() {
        ArrayList<Integer> availableEvents = new ArrayList<>();

        for (int i = 0; i < TOTAL_EVENTS; i++) {
            if (!isRejected[i] && currentStoryPoint[i] < totalStoryPoints[i] && !happenedToday[i]) {
                availableEvents.add(i);
            }
        }

        if (availableEvents.size() == 0) {
            return -1; // Nothing found ig.
        }

        int randomEventIndex = random.nextInt(availableEvents.size());
        return availableEvents.get(randomEventIndex);
    }

    public void completeStoryPoint(int storyID) {
        happenedToday[storyID] = true;
        currentStoryPoint[storyID] += 1; // Moving to the next point of the story.

        // If we'll make events, that are incompatible, they should block each other here, just in case.

        if (currentStoryPoint[storyID] >= totalStoryPoints[storyID]) {
            switch (storyID) {
                case EVENT_1:
                    ending = "ending 1";
                    break;
                case EVENT_2:
                    ending = "ending 2";
                    break;
                case EVENT_3:
                    ending = "ending 3";
                    break;
            }
        }

    }

    public void rejectStory(int storyID) {
        isRejected[storyID] = true;
        happenedToday[storyID] = true;
    }

    public String checkEnding() {
        // Checks if there are reasons to give player an ending.
        if (!ending.isEmpty()) {
            return ending;
        }
        if (rejectedTheLastStory) {
            ending = "boring ending";
            return ending;
        }
        boolean anyStoryToFinish = true; // Is it possible to complete a story.
        int daysLeft = TOTAL_DAYS - currentDay;
        for (int i = 0; i < TOTAL_EVENTS; i++) {
            if (!isRejected[i]) {
                int storyPointsLeft = totalStoryPoints[i] - currentStoryPoint[i];

                if (storyPointsLeft > daysLeft) {
                    isRejected[i] = true;
                } else {
                    anyStoryToFinish = true;
                }
            }
        }
        if (currentDay >= 14 | !anyStoryToFinish) {
            ending = "boring ending";
            return ending;
        }
        return "";
    }


}
