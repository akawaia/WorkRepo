public class FirstTask {

    private static final int employees = 30;
    private static final int handingDocument = 93;


    public static void main(String[] args) {
        int processedTwoDocs;
        int twoDocs, threeDocs, fourDocs, fiveDocs;
        for (int processedFourDocs = 10; processedFourDocs < 30; processedFourDocs += 10) {
            fourDocs = processedFourDocs * 4; // Число обработанных документов сотрудиками, обрабатывающих по 4 документа
            for (int processedThreeDocs = 0; processedThreeDocs < processedFourDocs; processedThreeDocs++) {
                threeDocs = processedThreeDocs * 3; // Число обработанных документов сотрудиками, обрабатывающих по 3 документа
                for (int processedFiveDocs = 2; processedFiveDocs < processedThreeDocs; processedFiveDocs += 2) {
                    fiveDocs = processedFiveDocs * 5; // Число обработанных документов сотрудиками, обрабатывающих по 5 документа
                    if ((handingDocument - fourDocs - threeDocs - fiveDocs) % 2 == 0) {
                        twoDocs = handingDocument - fourDocs - threeDocs - fiveDocs; // Число обработанных документов сотрудиками, обрабатывающих по 2 документа
                        processedTwoDocs = twoDocs / 2;
                        if (employees - processedFourDocs - processedThreeDocs - processedFiveDocs - processedTwoDocs == 0 &
                                handingDocument - twoDocs - threeDocs - fourDocs - fiveDocs == 0) {
                            System.out.println("Two documents processed: " + processedTwoDocs +
                                    "\nThree documents processed: " + processedThreeDocs +
                                    "\nFour documents processed: " + processedFourDocs +
                                    "\nFive documents processed: " + processedFiveDocs);
                        }
                    }
                }
            }
        }
    }
}

