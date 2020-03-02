package com.TestSuites;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        com.TestSuites.AddTest.class,
        com.TestSuites.ComputeCircleAreaTest.class,
        com.TestSuites.DivideTest.class,
        com.TestSuites.MinusTest.class,
        com.TestSuites.MultiplyTest.class,
        com.TestSuites.PowXTest.class,
})
public class TestSuite {
}
