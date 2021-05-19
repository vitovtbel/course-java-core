package com.rakovets.course.java.core.practice.io;

import com.rakovets.course.java.core.practice.io.file_analyzer.FileAnalyzeUtil;

import java.nio.file.Path;
import java.nio.file.Paths;

public class FileAnalyzeUtilDemo {
    public static void main(String[] args) {
        Path task02 = Paths.get("src", "main", "resources", "practice", "task02");
        Path task03 = Paths.get("src","main", "resources", "practice", "task03");
        Path task04 = Paths.get("src","main", "resources", "practice", "task04");
        Path task05 = Paths.get("src", "main", "resources", "practice", "task05");
        Path task06 = Paths.get("src","main", "resources", "practice", "task06");
        Path task07 = Paths.get("src","main", "resources", "practice", "task07");
        Path task08 = Paths.get("src","main", "resources", "practice", "task08");
        Path task08_ = Paths.get("src","main", "resources", "practice", "task08_");
        Path task09 = Paths.get("src","main", "resources", "practice", "task09");
        Path task10 = Paths.get("src","main", "resources", "practice", "task10");

        System.out.println(FileAnalyzeUtil.takeFilePathGetListString(task02));
        System.out.println(FileAnalyzeUtil.takeFilePathGetListWordsStartingVowel(task03));
        System.out.println(FileAnalyzeUtil.takeFilePathGetListWordsStartingFirstLetterFollowingWord(task04));
        System.out.println(FileAnalyzeUtil.takeFilePathGetListString(task05));
        System.out.println(FileAnalyzeUtil.takeFilePathGetMaxCombinationNumeral(task05));
        System.out.println(FileAnalyzeUtil.takeFilePathGetFrequencyRepetitionAllLettersInText(task06));
        System.out.println(FileAnalyzeUtil.takeFilePathGetFrequencyRepetitionAllWordsInTextAscendingOrder(task07));
        FileAnalyzeUtil.takeFilePathGetSortedNumbersInFile(task08);
        System.out.println(FileAnalyzeUtil.takeFilePathGetListString(task08_));
        System.out.println(FileAnalyzeUtil.takeFilePathGetAcademicPerformanceOfStudents(task09));
        FileAnalyzeUtil.takeFilePathGetReplaceModifier(task10.toString(),"public","private");
    }
}
