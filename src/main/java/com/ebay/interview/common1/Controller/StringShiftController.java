package com.ebay.interview.common1.Controller;


import com.ebay.interview.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/shift")
public class StringShiftController {

    private StringUtils stringShiftService;

    @GetMapping
    public String shiftString(@RequestParam String input, @RequestParam int times) {
        return stringShiftService.shiftString(input, times);
    }

}
