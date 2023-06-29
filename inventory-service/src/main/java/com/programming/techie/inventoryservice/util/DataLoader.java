package com.programming.techie.inventoryservice.util;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import com.programming.techie.inventoryservice.repository.InventoryRepo;
import org.springframework.stereotype.Component;
import com.programming.techie.inventoryservice.model.Inventory;

@RequiredArgsConstructor
@Component
public class DataLoader implements CommandLineRunner{
    private final InventoryRepo inventoryRepo;

    @Override
    public void run(String... args) {
        Inventory inventory = new Inventory();
        inventory.setSkuCode("iphone_13");
        inventory.setQuantity(100);

        Inventory inventory1 = new Inventory();
        inventory1.setSkuCode("iphone_13_red");
        inventory1.setQuantity(0);

        inventoryRepo.save(inventory);
        inventoryRepo.save(inventory1);
    }


}
