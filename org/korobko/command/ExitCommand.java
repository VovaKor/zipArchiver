package org.korobko.command;

import org.korobko.ConsoleHelper;

public class ExitCommand extends ZipCommand {
    @Override
    public void execute() throws Exception {
        ConsoleHelper.writeMessage("До встречи!");
    }
}
