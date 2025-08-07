package Spring_B.Controller;


import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

import Spring_B.Account;

import java.util.*;

@RestController
@SpringBootApplication(scanBasePackages = {"Spring_B", "Spring_B.Controller"})
public class AccountController {

    @GetMapping("/user/{id}/accounts")
    public List<Account> getAccounts(
            @PathVariable String id,
            @RequestParam String type,
            @RequestParam String status) {

        // Demo stub: return an Account using given params
        List<Account> accounts = new ArrayList<>();
        accounts.add(new Account(id, type, status));
        return accounts;
    }
}
