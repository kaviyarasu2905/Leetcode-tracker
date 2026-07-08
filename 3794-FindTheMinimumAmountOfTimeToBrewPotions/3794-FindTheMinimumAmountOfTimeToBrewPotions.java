// Last updated: 08/07/2026, 15:36:33
class Solution {
    public long minTime(int[] skill, int[] mana) {
        int n = skill.length;
        int m = mana.length;

        long sumSkill = 0;
        for (int x : skill) sumSkill += x;

        // For the first potion (j = 0)
        long prevWizardDone = sumSkill * mana[0];

        for (int j = 1; j < m; j++) {
            long prevPotionDone = prevWizardDone;

            // Walk backwards over wizards
            for (int i = n - 2; i >= 0; i--) {
                // subtract the contribution of wizard i+1 on the previous potion
                prevPotionDone -= (long) skill[i + 1] * mana[j - 1];

                // shift if needed
                long shiftNeeded = prevWizardDone - (long) skill[i] * mana[j];
                prevWizardDone = Math.max(prevPotionDone, shiftNeeded);
            }

            // add full processing time of current potion across all wizards
            prevWizardDone += sumSkill * mana[j];
        }

        return prevWizardDone;
    }
}
