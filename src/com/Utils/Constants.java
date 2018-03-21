package com.Utils;

public class Constants {
    public enum MessageType {PUTCHUNK, STORED}
    public static final String CRLF = "\r\n";
    public static final String CRLF_D = "\r\n\r\n";
    public static final String SPACE = " ";
    public static final String testFilePath = "testFiles/testPdf.pdf";

    public static final int CHUNKSIZE = 64000;
}
