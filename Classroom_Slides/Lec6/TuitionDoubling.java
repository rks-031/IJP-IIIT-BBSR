public class TuitionDoubling {
        public static void main(String[] args) {
                double initialTuition = 10000; // Initial tuition in dollars
                double tuition = initialTuition; // Current tuition
                double targetTuition = initialTuition * 2; // Target tuition (double the initial tuition)
                double annualIncreaseRate = 0.07; // 7% annual increase rate

                int years = 0; // Number of years

                while (tuition < targetTuition) {
                        tuition += tuition * annualIncreaseRate; // Increase tuition by the annual rate
                        years++;
                }

                System.out.println("It will take " + years + " years for the tuition fee to double.");
        }
}
