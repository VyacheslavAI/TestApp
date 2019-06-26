package ru.iteco.vyacheslav.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.iteco.vyacheslav.constant.StringValue;
import ru.iteco.vyacheslav.entity.StringHolder;
import ru.iteco.vyacheslav.repository.IStringHolderRepository;
import ru.iteco.vyacheslav.service.api.IStringHolderService;

@Service
public class StringHolderService implements IStringHolderService {

    private IStringHolderRepository stringHolderRepository;

    @Autowired
    public StringHolderService(IStringHolderRepository stringHolderRepository) {
        this.stringHolderRepository = stringHolderRepository;
    }

    @Override
    public StringHolder createOrUpdateStringHolder(String message) {
        StringHolder holder = new StringHolder();
        if (message == null || message.isEmpty()) {
            message = StringValue.DEFAULT_VALUE;
        }
        holder.setValue(message);
        return stringHolderRepository.save(holder);
    }
}
