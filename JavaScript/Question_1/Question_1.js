// Function to reverse words in a sentence
function reverseWordsInSentence(sentence) {
    const words = sentence.split(' ');
    const reversedWords = words.map(word => word.split('').reverse().join(''));
    const reversedSentence = reversedWords.join(' ');
    return reversedSentence;
}

// Get input from the user
const inputSentence = prompt("Enter a sentence:");
if (inputSentence !== null) {
    const reversedSentence = reverseWordsInSentence(inputSentence);
    console.log("Reversed sentence: " + reversedSentence);
    document.getElementById('rev').innerHTML = reversedSentence;
} else {
    console.log("No input provided.");
}
document.getElementById('rev').innerHTML = reversedSentence;