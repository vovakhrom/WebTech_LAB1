package by.bsuir.wt.lab1;

public class ProgrammerBook extends Book {
    private String language;
    private int level;

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    @Override
    public boolean equals(Object obj) {

        if (obj == this) {

            return true;
        }
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }
        ProgrammerBook programmerBook = (ProgrammerBook) obj;

        return super.equals(obj) && level == programmerBook.level
            && (language == programmerBook.language
                || (language != null &&language.equals(programmerBook.getLanguage()))
        );
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = super.hashCode();
        result = prime * result + ((language == null) ? 0 : language.hashCode());
        result = prime * result + level;
        return result;
    }
    @Override
    public String toString() {
        return  super.toString()+ " language=" + language
                + ", level=" + level +"]";
    }

    }
