class Solution {
    public List<Boolean> checkIfPrerequisite(int numCourses, int[][] prerequisites, int[][] queries) {

        boolean[][] reach = new boolean[numCourses][numCourses];

        // Direct prerequisites
        for (int[] pre : prerequisites) {
            reach[pre[0]][pre[1]] = true;
        }

        // Floyd-Warshall
        for (int k = 0; k < numCourses; k++) {
            for (int i = 0; i < numCourses; i++) {
                for (int j = 0; j < numCourses; j++) {
                    if (reach[i][k] && reach[k][j]) {
                        reach[i][j] = true;
                    }
                }
            }
        }

        List<Boolean> ans = new ArrayList<>();

        for (int[] query : queries) {
            ans.add(reach[query[0]][query[1]]);
        }

        return ans;
    }
}