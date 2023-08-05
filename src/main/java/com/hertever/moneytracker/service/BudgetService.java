package com.hertever.moneytracker.service;

import com.hertever.moneytracker.assembler.BudgetAssembler;
import com.hertever.moneytracker.entity.Budget;
import com.hertever.moneytracker.repository.BudgetRepository;
import com.hertever.moneytracker.util.MoneyTrackerUtil;
import com.hertever.moneytracker.util.exception.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Objects;

import static com.hertever.moneytracker.util.exception.ExceptionUtil.throwNotFound;

@Service
public class BudgetService {

    private final BudgetRepository budgetRepository;
    private final BudgetAssembler budgetAssembler;

    @Autowired
    public BudgetService(BudgetRepository budgetRepository, BudgetAssembler budgetAssembler) {
        this.budgetRepository = budgetRepository;
        this.budgetAssembler = budgetAssembler;
    }
    public Budget setBudget(Budget newBudget) {
        String id = MoneyTrackerUtil.getCustomPrimaryKey();
        Budget oldBudget = budgetRepository.findById(id).orElse(null);
        Budget updatedBudget = budgetAssembler.buildBudget(newBudget, oldBudget, id);
        return budgetRepository.save(updatedBudget);
    }
    public Budget getBudget() throws NotFoundException {
        String id = MoneyTrackerUtil.getCustomPrimaryKey();
        Budget budget = budgetRepository.findById(id).orElse(null);
        if (Objects.isNull(budget))
            throwNotFound("Record not found.");
        return budget;
    }
}
