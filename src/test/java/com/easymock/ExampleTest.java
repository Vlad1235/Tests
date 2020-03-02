package com.easymock;

import org.easymock.EasyMockRule;
import org.easymock.EasyMockSupport;
import org.easymock.Mock;
import org.easymock.TestSubject;
import org.junit.Rule;
import org.junit.Test;


public class ExampleTest extends EasyMockSupport {
    @Rule
    public EasyMockRule rule = new EasyMockRule(this);
    @Mock
    private Collaborator collaborator; // Create the mock
    @TestSubject
    private ClassForTest classForTest = new ClassForTest(); // Have it set to the tested class

    @Test
    public void addDocument() {
        collaborator.documentAdded("New Document"); // Record what we expect the mock to do
        replayAll(); // Tell all mocks we are now doing the actual testing
        classForTest.addDocument("New Document", "content"); // Test
        verifyAll(); // Make sure everything that was supposed to be called was called
    }
}
