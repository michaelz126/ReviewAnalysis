public class ReviewAnalysis {
    /** All user reviews to be included in this analysis */
    private Review[] allReviews;


    /** Initializes allReviews to contain all the Review objects to be analyzed */
    public ReviewAnalysis() {
        /* implementation not shown */ }


    /**
     * Returns a double representing the average rating of all the Review objects to
     * be
     * analyzed, as described in part (a)
     * Precondition: allReviews contains at least one Review.
     * No element of allReviews is null.
     */
    public double getAverageRating() {
        /* to be implemented in part (a) */ }


    /**
     * Returns an ArrayList of String objects containing formatted versions of
     * selected user comments, as described in part (b)
     * Precondition: allReviews contains at least one Review.
     * No element of allReviews is null.
     * Postcondition: allReviews is unchanged.
     */
    public ArrayList<String> collectComments() {
        /* to be implemented in part (b) */ }
}
