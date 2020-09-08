package com.mobon.commit;

import org.apache.commons.lang.WordUtils;

class CommitMessage {
    private static final int MAX_LINE_LENGTH = 72; // https://stackoverflow.com/a/2120040/5138796
    private final String content;

    CommitMessage(Object changeType, String longDescription) {
        this.content = buildContent(changeType, longDescription);
    }

    private String buildContent(Object changeType, String longDescription) {
        return "[" +
                changeType +
                ']' +
                " : " +
                System.lineSeparator() +
                WordUtils.wrap(longDescription, MAX_LINE_LENGTH);
    }

    @Override
    public String toString() {
        return content;
    }
}