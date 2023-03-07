package seedu.duke.router;

import seedu.duke.DukeSession;
import seedu.duke.command.ExecutableCommand;
import seedu.duke.command.factory.ExecutableCommandFactory;

class MockCommandFactory extends ExecutableCommandFactory {
    private String expectedRoute;

    public MockCommandFactory(String expectedRoute) {
        this.expectedRoute = expectedRoute;
    }

    public ExecutableCommand buildCommand(DukeSession dukeSession) {
        throw new UnsupportedOperationException("MockCommandFactory is for testing routing only!");
    }

    @Override
    public boolean equals(Object other) {
        if (!(other instanceof String)) {
            return false;
        }
        return this.expectedRoute.equals(other);
    }
}
