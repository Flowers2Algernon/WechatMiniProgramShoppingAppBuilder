package com.cskaoyan.market.controller;

import com.cskaoyan.market.db.domain.MarketAddress;
import com.cskaoyan.market.service.MarketAddressService;
import com.cskaoyan.market.util.ResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/admin/address")
public class AdminAddressController {
    @Autowired
    private MarketAddressService addressService;

    @GetMapping("/list")
    public ResponseEntity<Object> list(@RequestParam(required = false) Integer page,
                                       @RequestParam(required = false) Integer limit,
                                       @RequestParam(required = false) String userId,
                                       @RequestParam(required = false) String sort,
                                       @RequestParam(required = false) String order,
                                       @RequestParam(required = false) String name) {
        try {
            List<MarketAddress> marketAddressesList = addressService.list(limit, page, userId, sort, order, name);
            return ResponseEntity.ok(ResponseUtil.okList(marketAddressesList));
        } catch (NumberFormatException e) {
            return ResponseEntity.badRequest().body(ResponseUtil.badArgument());
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(ResponseUtil.fail());
        }
    }
}
