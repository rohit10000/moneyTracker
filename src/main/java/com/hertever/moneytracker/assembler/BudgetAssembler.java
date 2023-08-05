package com.hertever.moneytracker.assembler;

import com.hertever.moneytracker.entity.Budget;
import org.springframework.stereotype.Component;

import java.util.Objects;

@Component
public class BudgetAssembler {
    public Budget buildBudget(Budget newBudget, Budget oldBudget, String id) {
        if (Objects.isNull(oldBudget)) {
            newBudget.setId(id);
            return newBudget;
        } else {
            return updateBudget(oldBudget, newBudget);
        }
    }
    private Budget updateBudget(Budget oldBudget, Budget newBudget) {
        oldBudget.setBills(oldBudget.getBills() + newBudget.getBills());
        oldBudget.setIncome(oldBudget.getIncome() + newBudget.getIncome());
        oldBudget.setCarFuel(oldBudget.getCarFuel() + newBudget.getCarFuel());
        oldBudget.setSubscriptions(oldBudget.getSubscriptions() + newBudget.getSubscriptions());
        oldBudget.setShopping(oldBudget.getShopping() + newBudget.getShopping());
        oldBudget.setTravelExpenses(oldBudget.getTravelExpenses() + newBudget.getTravelExpenses());
        oldBudget.setLoans(oldBudget.getLoans() + newBudget.getLoans());
        oldBudget.setGrocery(oldBudget.getGrocery() + newBudget.getGrocery());
        oldBudget.setRent(oldBudget.getRent() + newBudget.getRent());
        oldBudget.setBooks(oldBudget.getBooks() + newBudget.getBooks());
        oldBudget.setMisc(oldBudget.getMisc() + newBudget.getMisc());
        return oldBudget;
    }
}
