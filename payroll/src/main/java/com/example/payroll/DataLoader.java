package com.example.payroll;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Autowired
    private BillRepository billRepository;

    @Override
    public void run(String... args) throws Exception {

        Employee employee1 = new Employee();
        employee1.setName("Benoite Guilliland");
        employee1.setRole("Construction Foreman");
        employee1.setNumber(1L);
        employee1.setCity("Ban Dan");
        employee1.setAge(1L);


        employeeRepository.save(employee1);


        Bill bill11 = new Bill();
        bill11.setId(1L);
        bill11.setDateEmission("6/20/2023");
        bill11.setDateEchéance("6/23/2023");
        bill11.setMontantTotal(90L);
        bill11.setStatut("Payée");
        bill11.setMéthodePaiement("Virement bancaire");
        bill11.setEmployee(employee1);

        billRepository.save(bill11);

        Bill bill12 = new Bill();
        bill12.setId(2L);
        bill12.setDateEmission("3/2/2023");
        bill12.setDateEchéance("3/12/2023");
        bill12.setMontantTotal(80L);
        bill12.setStatut("en retard");
        bill12.setMéthodePaiement("Virement bancaire");
        bill12.setEmployee(employee1);

        billRepository.save(bill12);

        Bill bill13 = new Bill();
        bill13.setId(3L);
        bill13.setDateEmission("7/10/2023");
        bill13.setDateEchéance("3/12/2023");
        bill13.setMontantTotal(100L);
        bill13.setStatut("Payée partiellement");
        bill13.setMéthodePaiement("chèque");
        bill13.setEmployee(employee1);

        billRepository.save(bill13);

        Bill bill14 = new Bill();
        bill14.setId(4L);
        bill14.setDateEmission("7/10/2023");
        bill14.setDateEchéance("3/12/2023");
        bill14.setMontantTotal(50L);
        bill14.setStatut("Payée");
        bill14.setMéthodePaiement("Carte crédit");
        bill14.setEmployee(employee1);

        billRepository.save(bill14);

        Bill bill15 = new Bill();
        bill15.setId(8L);
        bill15.setDateEmission("8/10/2023");
        bill15.setDateEchéance("4/12/2023");
        bill15.setMontantTotal(50L);
        bill15.setStatut("Payée");
        bill15.setMéthodePaiement("Carte crédit");
        bill15.setEmployee(employee1);

        billRepository.save(bill15);

        Employee employee2 = new Employee();
        employee2.setName("Larisa Ethridge");
        employee2.setRole("Construction Expeditor");
        employee2.setNumber(2L);
        employee2.setCity("Duncan Town");
        employee2.setAge(2L);


        employeeRepository.save(employee2);

        Bill bill21 = new Bill();
        bill21.setId(5L);
        bill21.setDateEmission("7/10/2023");
        bill21.setDateEchéance("3/12/2023");
        bill21.setMontantTotal(520L);
        bill21.setStatut("Payée");
        bill21.setMéthodePaiement("Carte crédit");
        bill21.setEmployee(employee2);

        billRepository.save(bill21);

        Bill bill22 = new Bill();
        bill22.setId(6L);
        bill22.setDateEmission("7/10/2023");
        bill22.setDateEchéance("3/12/2023");
        bill22.setMontantTotal(520L);
        bill22.setStatut("Payée");
        bill22.setMéthodePaiement("Carte crédit");
        bill22.setEmployee(employee2);

        billRepository.save(bill22);

        Bill bill23 = new Bill();
        bill23.setId(7L);
        bill23.setDateEmission("7/10/2023");
        bill23.setDateEchéance("3/12/2023");
        bill23.setMontantTotal(430L);
        bill23.setStatut("Payée partiellement");
        bill23.setMéthodePaiement("Carte crédit");
        bill23.setEmployee(employee2);

        billRepository.save(bill23);

        Employee employee3 = new Employee();
        employee3.setName("Debbie Vogt");
        employee3.setRole("Architect");
        employee3.setNumber(3L);
        employee3.setCity("Nueva Imperial");
        employee3.setAge(3L);


        employeeRepository.save(employee3);

        Bill bill31 = new Bill();
        bill31.setId(9L);
        bill31.setDateEmission("7/10/2023");
        bill31.setDateEchéance("3/12/2023");
        bill31.setMontantTotal(430L);
        bill31.setStatut("Payée partiellement");
        bill31.setMéthodePaiement("Carte crédit");
        bill31.setEmployee(employee3);

        billRepository.save(bill31);

        Bill bill32 = new Bill();
        bill32.setId(10L);
        bill32.setDateEmission("7/10/2023");
        bill32.setDateEchéance("3/12/2023");
        bill32.setMontantTotal(50L);
        bill32.setStatut("Payée partiellement");
        bill32.setMéthodePaiement("Carte crédit");
        bill32.setEmployee(employee3);

        billRepository.save(bill32);

        Bill bill33 = new Bill();
        bill33.setId(11L);
        bill33.setDateEmission("7/10/2023");
        bill33.setDateEchéance("3/12/2023");
        bill33.setMontantTotal(50L);
        bill33.setStatut("Payée");
        bill33.setMéthodePaiement("Carte crédit");
        bill33.setEmployee(employee3);

        billRepository.save(bill33);

        Employee employee4 = new Employee();
        employee4.setName("Katya Greenland");
        employee4.setRole("Estimator");
        employee4.setNumber(4L);
        employee4.setCity("Boulsa");
        employee4.setAge(4L);


        employeeRepository.save(employee4);

        Bill bill41 = new Bill();
        bill41.setId(12L);
        bill41.setDateEmission("7/10/2023");
        bill41.setDateEchéance("3/12/2023");
        bill41.setMontantTotal(50L);
        bill41.setStatut("Payée");
        bill41.setMéthodePaiement("Carte crédit");
        bill41.setEmployee(employee4);

        billRepository.save(bill41);

        Bill bill42 = new Bill();
        bill42.setId(13L);
        bill42.setDateEmission("7/10/2023");
        bill42.setDateEchéance("3/12/2023");
        bill42.setMontantTotal(50L);
        bill42.setStatut("Payée");
        bill42.setMéthodePaiement("Carte crédit");
        bill42.setEmployee(employee4);

        billRepository.save(bill42);

        Employee employee5 = new Employee();
        employee5.setName("Merwin Infantino");
        employee5.setRole("Construction Expeditor");
        employee5.setNumber(5L);
        employee5.setCity("Budapest");
        employee5.setAge(5L);


        employeeRepository.save(employee5);

        Bill bill51 = new Bill();
        bill51.setId(14L);
        bill51.setDateEmission("7/10/2023");
        bill51.setDateEchéance("3/12/2023");
        bill51.setMontantTotal(250L);
        bill51.setStatut("Payée partiellement");
        bill51.setMéthodePaiement("chèque");
        bill51.setEmployee(employee5);

        billRepository.save(bill51);

        Bill bill52 = new Bill();
        bill52.setId(15L);
        bill52.setDateEmission("7/10/2023");
        bill52.setDateEchéance("3/12/2023");
        bill52.setMontantTotal(250L);
        bill52.setStatut("Payée partiellement");
        bill52.setMéthodePaiement("chèque");
        bill52.setEmployee(employee5);

        billRepository.save(bill52);

        Employee employee6 = new Employee();
        employee6.setName("Benjie Colmore");
        employee6.setRole("Project Manager");
        employee6.setNumber(6L);
        employee6.setCity("Poigar");
        employee6.setAge(6L);


        employeeRepository.save(employee6);

        Bill bill61 = new Bill();
        bill61.setId(16L);
        bill61.setDateEmission("7/10/2023");
        bill61.setDateEchéance("3/12/2023");
        bill61.setMontantTotal(25L);
        bill61.setStatut("Payée partiellement");
        bill61.setMéthodePaiement("chèque");
        bill61.setEmployee(employee6);

        billRepository.save(bill61);

        Employee employee7 = new Employee();
        employee7.setName("Wilek O'Kynsillaghe");
        employee7.setRole("Electrician");
        employee7.setNumber(7L);
        employee7.setCity("Soutelo");
        employee7.setAge(7L);


        employeeRepository.save(employee7);

        Bill bill71 = new Bill();
        bill71.setId(17L);
        bill71.setDateEmission("7/10/2023");
        bill71.setDateEchéance("3/12/2023");
        bill71.setMontantTotal(25L);
        bill71.setStatut("Payée partiellement");
        bill71.setMéthodePaiement("chèque");
        bill71.setEmployee(employee7);

        billRepository.save(bill71);

        Employee employee8 = new Employee();
        employee8.setName("Wilek O'Kynsillaghe");
        employee8.setRole("Electrician");
        employee8.setNumber(7L);
        employee8.setCity("Soutelo");
        employee8.setAge(8L);

        employeeRepository.save(employee8);

        Bill bill81 = new Bill();
        bill81.setId(18L);
        bill81.setDateEmission("7/10/2023");
        bill81.setDateEchéance("3/12/2023");
        bill81.setMontantTotal(25L);
        bill81.setStatut("Payée partiellement");
        bill81.setMéthodePaiement("chèque");
        bill81.setEmployee(employee8);

        billRepository.save(bill81);

        Employee employee9 = new Employee();
        employee9.setName("Rozamond Toye");
        employee9.setRole("Supervisor");
        employee9.setNumber(9L);
        employee9.setCity("Al Qāmishlī");
        employee9.setAge(9L);

        employeeRepository.save(employee9);

        Bill bill91 = new Bill();
        bill91.setId(19L);
        bill91.setDateEmission("7/10/2023");
        bill91.setDateEchéance("3/12/2023");
        bill91.setMontantTotal(25L);
        bill91.setStatut("Payée partiellement");
        bill91.setMéthodePaiement("chèque");
        bill91.setEmployee(employee9);

        billRepository.save(bill91);

        Employee employee10 = new Employee();
        employee10.setName("Rozamond Toye");
        employee10.setRole("Supervisor");
        employee10.setNumber(10L);
        employee10.setCity("Al Qāmishlī");
        employee10.setAge(10L);

        employeeRepository.save(employee10);

        Bill bill101 = new Bill();
        bill101.setId(20L);
        bill101.setDateEmission("7/10/2023");
        bill101.setDateEchéance("3/12/2023");
        bill101.setMontantTotal(25L);
        bill101.setStatut("Payée partiellement");
        bill101.setMéthodePaiement("chèque");
        bill101.setEmployee(employee10);

        billRepository.save(bill101);
    }
}

