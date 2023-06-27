package com.example.copytrade.service;

public interface DiffMerge {
    Long diffLong();

    String diffString();

    Long checkRebase();
    Integer rebaseLocal();
    Double rebaseDevelop();
    String finalMerge();
}
