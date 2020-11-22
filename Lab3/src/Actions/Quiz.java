package Actions;

import java.util.Objects;

public class Quiz {
    private String quiz;
    private String answer;

    public Quiz(String st, String str) {
        quiz = st;
        answer = str;
    }

    public String getQuiz() {
        return quiz;
    }

    public String getAnswer() {
        return answer;
    }

    @Override
    public String toString() {
        return "Quiz{" +
                "quiz='" + quiz + '\'' +
                ", answer='" + answer + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Quiz quiz1 = (Quiz) o;
        return quiz.equals(quiz1.quiz) &&
                answer.equals(quiz1.answer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(quiz, answer);
    }
}
