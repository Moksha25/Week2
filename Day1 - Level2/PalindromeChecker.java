public class PalindromeChecker 
{
    private String text;

    // Constructor 
    public PalindromeChecker(String text) {
        this.text = text;
    }

    public boolean isPalindrome() 
    {
        String cleanText = text.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        
        String reversedText = new StringBuilder(cleanText).reverse().toString();
        return cleanText.equals(reversedText);
    }

    public void displayResult() 
    {
        if (isPalindrome()) 
        {
            System.out.println(text + " is a palindrome.");
        } 
        else 
        {
            System.out.println(text + " is not a palindrome.");
        }
    }

    public static void main(String[] args) 
    {
        // Example usage:
        String input = "aabbbbaa";
        PalindromeChecker checker = new PalindromeChecker(input);
        checker.displayResult();
    }
}
