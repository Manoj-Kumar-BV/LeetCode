class Solution {
    // Function to return an ArrayList with exact result and formatted result
    static ArrayList<Float> divisionWithPrecision(float a, float b) {
        // code here
        ArrayList<Float> result = new ArrayList<>();
        float exact = a/b;
        result.add(exact);
        float rounded = Float.parseFloat(String.format("%.3f", exact));
        result.add(rounded);
        return result;
    }
}