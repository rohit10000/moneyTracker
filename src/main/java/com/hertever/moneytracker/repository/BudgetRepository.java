package com.hertever.moneytracker.repository;

import com.hertever.moneytracker.entity.Budget;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public interface BudgetRepository extends CrudRepository<Budget, String> {
}
