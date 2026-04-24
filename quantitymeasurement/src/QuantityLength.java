private static final double EPS = 1e-6;

@Test
void testConversion_FeetToInches() {
    assertEquals(12.0,
            QuantityLength.convert(1.0, LengthUnit.FEET, LengthUnit.INCH),
            EPS);
    void testAddition_SameUnit_FeetPlusFeet() {
        QuantityLength result =
                new QuantityLength(1.0, LengthUnit.FEET)
                        .add(new QuantityLength(2.0, LengthUnit.FEET));

        assertEquals(3.0, result.convertTo(LengthUnit.FEET).value, EPS);
    }

    @Test
    void testConversion_InchesToFeet() {
        assertEquals(2.0,
                QuantityLength.convert(24.0, LengthUnit.INCH, LengthUnit.FEET),
                EPS);
        void testAddition_CrossUnit_FeetPlusInches() {
            QuantityLength result =
                    new QuantityLength(1.0, LengthUnit.FEET)
                            .add(new QuantityLength(12.0, LengthUnit.INCH));

            assertEquals(2.0, result.convertTo(LengthUnit.FEET).value, EPS);
        }

        @Test
        void testConversion_YardsToInches() {
            assertEquals(36.0,
                    QuantityLength.convert(1.0, LengthUnit.YARDS, LengthUnit.INCH),
                    EPS);
            void testAddition_CrossUnit_InchPlusFeet() {
                QuantityLength result =
                        new QuantityLength(12.0, LengthUnit.INCH)
                                .add(new QuantityLength(1.0, LengthUnit.FEET));

                assertEquals(24.0, result.convertTo(LengthUnit.INCH).value, EPS);
            }

            @Test
            void testConversion_CentimeterToInch() {
                assertEquals(1.0,
                        QuantityLength.convert(2.54, LengthUnit.CENTIMETER, LengthUnit.INCH),
                        1e-3); // tolerance
                void testAddition_YardPlusFeet() {
                    QuantityLength result =
                            new QuantityLength(1.0, LengthUnit.YARDS)
                                    .add(new QuantityLength(3.0, LengthUnit.FEET));

                    assertEquals(2.0, result.convertTo(LengthUnit.YARDS).value, EPS);
                }

                @Test
                void testConversion_RoundTrip() {
                    double value = 5.0;
                    double result = QuantityLength.convert(
                            QuantityLength.convert(value, LengthUnit.FEET, LengthUnit.INCH),
                            LengthUnit.INCH,
                            LengthUnit.FEET
                    );

                    assertEquals(value, result, EPS);
                    void testAddition_CentimeterPlusInch() {
                        QuantityLength result =
                                new QuantityLength(2.54, LengthUnit.CENTIMETER)
                                        .add(new QuantityLength(1.0, LengthUnit.INCH));

                        assertEquals(5.08,
                                result.convertTo(LengthUnit.CENTIMETER).value,
                                1e-2);
                    }

                    @Test
                    void testConversion_Zero() {
                        assertEquals(0.0,
                                QuantityLength.convert(0.0, LengthUnit.FEET, LengthUnit.INCH),
                                EPS);
                        void testAddition_Commutativity() {
                            QuantityLength a = new QuantityLength(1.0, LengthUnit.FEET);
                            QuantityLength b = new QuantityLength(12.0, LengthUnit.INCH);

                            assertEquals(a.add(b).toFeet(), b.add(a).toFeet(), EPS);
                        }

                        @Test
                        void testConversion_Negative() {
                            assertEquals(-12.0,
                                    QuantityLength.convert(-1.0, LengthUnit.FEET, LengthUnit.INCH),
                                    EPS);
                            void testAddition_WithZero() {
                                QuantityLength result =
                                        new QuantityLength(5.0, LengthUnit.FEET)
                                                .add(new QuantityLength(0.0, LengthUnit.INCH));

                                assertEquals(5.0, result.convertTo(LengthUnit.FEET).value, EPS);
                            }

                            @Test
                            void testConversion_InvalidUnit() {
                                assertThrows(IllegalArgumentException.class, () -> {
                                    QuantityLength.convert(1.0, null, LengthUnit.FEET);
                                });
                                void testAddition_NegativeValues() {
                                    QuantityLength result =
                                            new QuantityLength(5.0, LengthUnit.FEET)
                                                    .add(new QuantityLength(-2.0, LengthUnit.FEET));

                                    assertEquals(3.0, result.convertTo(LengthUnit.FEET).value, EPS);
                                }

                                @Test
                                void testConversion_InvalidValue() {
                                    void testAddition_NullOperand() {
                                        assertThrows(IllegalArgumentException.class, () -> {
                                            QuantityLength.convert(Double.NaN, LengthUnit.FEET, LengthUnit.INCH);
                                            new QuantityLength(1.0, LengthUnit.FEET).add(null);
                                        });
                                    }
                                }