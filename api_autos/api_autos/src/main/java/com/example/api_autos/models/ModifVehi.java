package com.example.api_autos.models;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;

public class ModifVehi {
    @Min(1)
    @Max(9999999)
    private int precio;
}
