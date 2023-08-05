package com.hertever.moneytracker.controller;

import com.hertever.moneytracker.entity.Budget;
import com.hertever.moneytracker.service.BudgetService;
import com.hertever.moneytracker.util.exception.NotFoundException;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "moneyTracker/v1/")
public class BudgetController {

    private final BudgetService budgetService;
    
    @Autowired
    public BudgetController(BudgetService budgetService) {
        this.budgetService = budgetService;
    }

    @ApiOperation(value = "To post and update ledger details", response = Budget.class, code = 200)
    @PostMapping(path="/budget")
    public Budget setBudget(@RequestBody Budget budget) {
        return budgetService.setBudget(budget);
    }

    @ApiOperation(value = "To get ledger details", response = Budget.class, code = 200)
    @ApiResponses(value = {@ApiResponse(code=404, message = "Not Found")})
    @GetMapping(path="/budget")
    public Budget getBudget() throws NotFoundException {
        return budgetService.getBudget();
    }
}
