package codoacodo.vuelosapi.controller;

import codoacodo.vuelosapi.model.Company;
import codoacodo.vuelosapi.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/company")
public class CompanyController {

    @Autowired
    CompanyService companyService;

    @GetMapping("")
    public List<Company> getAllCompanies(){
        return companyService.getAllCompanies();
    }

    @GetMapping("/{id}")
    public Optional<Company> getCompanyById(@PathVariable Long id) {
        return companyService.getCompanyById(id);
    }

    @DeleteMapping("/deletecompany/{id}")
    public void deleteCompany(@PathVariable Long id) {
        companyService.deleteCompany(id);
    }


    @PostMapping("/addcompany")
    public void addCompany(@RequestBody Company company){
        companyService.addCompany(company);
    }

    @PutMapping("/updatecompany")
    public Optional<Company> updateCompany(@RequestBody Company company) {
        return companyService.updateCompany(company);
    }
}
