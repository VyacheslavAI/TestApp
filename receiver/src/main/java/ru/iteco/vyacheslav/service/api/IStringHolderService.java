package ru.iteco.vyacheslav.service.api;

import ru.iteco.vyacheslav.entity.StringHolder;

public interface IStringHolderService {

    StringHolder createOrUpdateStringHolder(String message);
}
