package ru.forinnyy.tm.command;


import ru.forinnyy.tm.api.model.ICommand;
import ru.forinnyy.tm.api.service.IServiceLocator;

public abstract class AbstractCommand implements ICommand {

    protected IServiceLocator serviceLocator;

    public IServiceLocator getServiceLocator() {
        return serviceLocator;
    }

    public void setServiceLocator(final IServiceLocator serviceLocator) {
        this.serviceLocator = serviceLocator;
    }

    @Override
    public String toString() {
        final String name = getName();
        final String argument = getArgument();
        final String description = getDescription();
        String result = "";
        if (name != null && !name.isEmpty()) result += name + " : ";
        if (argument != null && !argument.isEmpty()) result += argument + " : ";
        if (description != null && !description.isEmpty()) result += description;
        return result;
    }

}
