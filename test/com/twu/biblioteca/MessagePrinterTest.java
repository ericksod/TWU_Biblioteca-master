package com.twu.biblioteca;

import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;

import java.io.PrintStream;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class MessagePrinterTest {
    MessagePrinter printer;
    PrintStream printStream;

    @Before
    public void setUp(){
        printStream = mock(PrintStream.class);
        printer = new MessagePrinter(printStream);
    }

    @Test
    public void testPrintWelcome() throws Exception {
        printer.printWelcome();
        verify(printStream).println("Welcome to Biblioteca!");
    }
}