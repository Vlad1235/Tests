package com.easymock;

public class ClassForTest {
    private Collaborator listener;

    public void setListener(Collaborator listener) {
        this.listener = listener;
    }

    public void addDocument(String title, String document) {
        listener.documentAdded(title);
    }
}
