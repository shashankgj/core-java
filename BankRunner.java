class BankRunner {
    public static void main(String[] args) {
        String[] managerNames = Bank.getManagerNames();
        for (int i = 0; i < managerNames.length; i++) {
            System.out.println(managerNames[i]);
        }

        int[] branchCodes = Bank.getBranchCodes();
        for (int i = 0; i < branchCodes.length; i++) {
            System.out.println(branchCodes[i]);
        }

        float[] interestRates = Bank.getInterestRates();
        for (int i = 0; i < interestRates.length; i++) {
            System.out.println(interestRates[i]);
        }

        double[] loanAmounts = Bank.getLoanAmounts();
        for (int i = 0; i < loanAmounts.length; i++) {
            System.out.println(loanAmounts[i]);
        }

        char[] ratingGrades = Bank.getRatingGrades();
        for (int i = 0; i < ratingGrades.length; i++) {
            System.out.println(ratingGrades[i]);
        }

        boolean[] isActive = Bank.getIsActiveBranches();
        for (int i = 0; i < isActive.length; i++) {
            System.out.println(isActive[i]);
        }

        long[] accountNumbers = Bank.getAccountNumbers();
        for (int i = 0; i < accountNumbers.length; i++) {
            System.out.println(accountNumbers[i]);
        }

        short[] floorNumbers = Bank.getFloorNumbers();
        for (int i = 0; i < floorNumbers.length; i++) {
            System.out.println(floorNumbers[i]);
        }

        byte[] atmCodes = Bank.getAtmCodes();
        for (int i = 0; i < atmCodes.length; i++) {
            System.out.println(atmCodes[i]);
        }
    }
}
