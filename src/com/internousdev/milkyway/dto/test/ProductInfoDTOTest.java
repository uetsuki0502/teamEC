
package com.internousdev.milkyway.dto.test;

import static org.junit.Assert.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Test;

import com.internousdev.milkyway.dto.ProductInfoDTO;

public class ProductInfoDTOTest {
	// test getId()
	// テストのメソッドであることを示しているもの
	@Test
	public void test_getId_null() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = null;

		dto.setId(expected);
		String actual = dto.getId();
		assertEquals(expected,actual);
	}
	@Test
	public void test_getId_emptyCharacter() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "";

		dto.setId(expected);
		String actual = dto.getId();
		assertEquals(expected,actual);
	}
	@Test
	public void test_getId_space() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = " ";

		dto.setId(expected);
		String actual = dto.getId();
		assertEquals(expected,actual);
	}
	@Test
	public void test_getId_fullSpace() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "　";

		dto.setId(expected);
		String actual = dto.getId();
		assertEquals(expected,actual);
	}
	@Test
	public void test_getId_alphabeticCharacters() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "abc";

		dto.setId(expected);
		String actual = dto.getId();
		assertEquals(expected,actual);
	}
	@Test
	public void test_getId_halfWidthDigit() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "123";

		dto.setId(expected);
		String actual = dto.getId();
		assertEquals(expected,actual);
	}
	@Test
	public void test_getId_hiragana() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "てすと";

		dto.setId(expected);
		String actual = dto.getId();
		assertEquals(expected,actual);
	}
	@Test
	public void test_getId_katakana() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "テスト";

		dto.setId(expected);
		String actual = dto.getId();
		assertEquals(expected,actual);
	}
	@Test
	public void test_getId_kanji() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "漢字";

		dto.setId(expected);
		String actual = dto.getId();
		assertEquals(expected,actual);
	}
	@Test
	public void test_getId_all() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "漢字 テスト　てすと123abc";

		dto.setId(expected);
		String actual = dto.getId();
		assertEquals(expected,actual);
	}
	// test setId()
	@Test
	public void test_setId_null() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = null;

		dto.setId(expected);
		String actual = dto.getId();
		assertEquals(expected,actual);
	}
	@Test
	public void test_setId_emptyCharacter() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "";

		dto.setId(expected);
		String actual = dto.getId();
		assertEquals(expected,actual);
	}
	@Test
	public void test_setId_space() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = " ";

		dto.setId(expected);
		String actual = dto.getId();
		assertEquals(expected,actual);
	}
	@Test
	public void test_setId_fullSpace() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "　";

		dto.setId(expected);
		String actual = dto.getId();
		assertEquals(expected,actual);
	}

	@Test
	public void test_setId_alphabeticCharacters() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "abc";

		dto.setId(expected);
		String actual = dto.getId();
		assertEquals(expected,actual);
	}
	@Test
	public void test_setId_halfWidthDigit() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "123";

		dto.setId(expected);
		String actual = dto.getId();
		assertEquals(expected,actual);
	}
	@Test
	public void test_setId_hiragana() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "てすと";

		dto.setId(expected);
		String actual = dto.getId();
		assertEquals(expected,actual);
	}
	@Test
	public void test_setId_katakana() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "テスト";

		dto.setId(expected);
		String actual = dto.getId();
		assertEquals(expected,actual);
	}
	@Test
	public void test_setId_kanji() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "漢字";

		dto.setId(expected);
		String actual = dto.getId();
		assertEquals(expected,actual);
	}
	@Test
	public void test_setId_all() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "漢字 テスト　てすと123abc";

		dto.setId(expected);
		String actual = dto.getId();
		assertEquals(expected,actual);
	}
	// test getProductId()
	@Test
	public void test_getProductId_null() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = null;

		dto.setProductId(expected);
		String actual = dto.getProductId();
		assertEquals(expected,actual);
	}
	@Test
	public void test_getProductId_emptyCharacter() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "";

		dto.setProductId(expected);
		String actual = dto.getProductId();
		assertEquals(expected,actual);
	}
	@Test
	public void test_getProductId_space() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = " ";

		dto.setProductId(expected);
		String actual = dto.getProductId();
		assertEquals(expected,actual);
	}
	@Test
	public void test_getProductId_fullSpace() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "　";

		dto.setProductId(expected);
		String actual = dto.getProductId();
		assertEquals(expected,actual);
	}
	@Test
	public void test_getProductId_alphabeticCharacters() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "abc";

		dto.setProductId(expected);
		String actual = dto.getProductId();
		assertEquals(expected,actual);
	}
	@Test
	public void test_getProductId_halfWidthDigit() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "123";

		dto.setProductId(expected);
		String actual = dto.getProductId();
		assertEquals(expected,actual);
	}
	@Test
	public void test_getProductId_hiragana() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "てすと";

		dto.setProductId(expected);
		String actual = dto.getProductId();
		assertEquals(expected,actual);
	}
	@Test
	public void test_getProductId_katakana() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "テスト";

		dto.setProductId(expected);
		String actual = dto.getProductId();
		assertEquals(expected,actual);
	}
	@Test
	public void test_getProductId_kanji() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "漢字";

		dto.setProductId(expected);
		String actual = dto.getProductId();
		assertEquals(expected,actual);
	}
	@Test
	public void test_getProductId_all() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "漢字 テスト　てすと123abc";

		dto.setProductId(expected);
		String actual = dto.getProductId();
		assertEquals(expected,actual);
	}
	// test setProductId()
	@Test
	public void test_setProductId_null() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = null;

		dto.setProductId(expected);
		String actual = dto.getProductId();
		assertEquals(expected,actual);
	}
	@Test
	public void test_setProductId_emptyCharacter() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "";

		dto.setProductId(expected);
		String actual = dto.getProductId();
		assertEquals(expected,actual);
	}
	@Test
	public void test_setProductId_space() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = " ";

		dto.setProductId(expected);
		String actual = dto.getProductId();
		assertEquals(expected,actual);
	}
	@Test
	public void test_setProductId_fullSpace() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "　";

		dto.setProductId(expected);
		String actual = dto.getProductId();
		assertEquals(expected,actual);
	}
	@Test
	public void test_setProductId_alphabeticCharacters() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "abc";

		dto.setProductId(expected);
		String actual = dto.getProductId();
		assertEquals(expected,actual);
	}
	@Test
	public void test_setProductId_halfWidthDigit() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "123";

		dto.setProductId(expected);
		String actual = dto.getProductId();
		assertEquals(expected,actual);
	}
	@Test
	public void test_setProductId_hiragana() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "てすと";

		dto.setProductId(expected);
		String actual = dto.getProductId();
		assertEquals(expected,actual);
	}
	@Test
	public void test_setProductId_katakana() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "テスト";

		dto.setProductId(expected);
		String actual = dto.getProductId();
		assertEquals(expected,actual);
	}
	@Test
	public void test_setProductId_kanji() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "漢字";

		dto.setProductId(expected);
		String actual = dto.getProductId();
		assertEquals(expected,actual);
	}
	@Test
	public void test_setProductId_all() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "漢字 テスト　てすと123abc";

		dto.setProductId(expected);
		String actual = dto.getProductId();
		assertEquals(expected,actual);
	}
	// test getProductName()
	@Test
	public void test_getProductName_null() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = null;

		dto.setProductName(expected);
		String actual = dto.getProductName();
		assertEquals(expected,actual);
	}
	@Test
	public void test_getProductName_emptyCharacter() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "";

		dto.setProductName(expected);
		String actual = dto.getProductName();
		assertEquals(expected,actual);
	}
	@Test
	public void test_getProductName_space() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = " ";

		dto.setProductName(expected);
		String actual = dto.getProductName();
		assertEquals(expected,actual);
	}
	@Test
	public void test_getProductName_fullSpace() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "　";

		dto.setProductName(expected);
		String actual = dto.getProductName();
		assertEquals(expected,actual);
	}
	@Test
	public void test_getProductName_alphabeticCharacters() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "abc";

		dto.setProductName(expected);
		String actual = dto.getProductName();
		assertEquals(expected,actual);
	}
	@Test
	public void test_getProductName_halfWidthDigit() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "123";

		dto.setProductName(expected);
		String actual = dto.getProductName();
		assertEquals(expected,actual);
	}
	@Test
	public void test_getProductName_hiragana() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "てすと";

		dto.setProductName(expected);
		String actual = dto.getProductName();
		assertEquals(expected,actual);
	}
	@Test
	public void test_getProductName_katakana() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "テスト";

		dto.setProductName(expected);
		String actual = dto.getProductName();
		assertEquals(expected,actual);
	}
	@Test
	public void test_getProductName_kanji() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "漢字";

		dto.setProductName(expected);
		String actual = dto.getProductName();
		assertEquals(expected,actual);
	}
	@Test
	public void test_getProductName_all() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "漢字 テスト　てすと123abc";

		dto.setProductName(expected);
		String actual = dto.getProductName();
		assertEquals(expected,actual);
	}

	// test setProductName()
	@Test
	public void test_setProductName_null() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = null;

		dto.setProductName(expected);
		String actual = dto.getProductName();
		assertEquals(expected,actual);
	}
	@Test
	public void test_setProductName_emptyCharacter() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "";

		dto.setProductName(expected);
		String actual = dto.getProductName();
		assertEquals(expected,actual);
	}
	@Test
	public void test_setProductName_space() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = " ";

		dto.setProductName(expected);
		String actual = dto.getProductName();
		assertEquals(expected,actual);
	}
	@Test
	public void test_setProductName_fullSpace() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "　";

		dto.setProductName(expected);
		String actual = dto.getProductName();
		assertEquals(expected,actual);
	}

	@Test
	public void test_setProductName_alphabeticCharacters() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "abc";

		dto.setProductName(expected);
		String actual = dto.getProductName();
		assertEquals(expected,actual);
	}
	@Test
	public void test_setProductName_halfWidthDigit() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "123";

		dto.setProductName(expected);
		String actual = dto.getProductName();
		assertEquals(expected,actual);
	}
	@Test
	public void test_setProductName_hiragana() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "てすと";

		dto.setProductName(expected);
		String actual = dto.getProductName();
		assertEquals(expected,actual);
	}
	@Test
	public void test_setProductName_katakana() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "テスト";

		dto.setProductName(expected);
		String actual = dto.getProductName();
		assertEquals(expected,actual);
	}
	@Test
	public void test_setProductName_kanji() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "漢字";

		dto.setProductName(expected);
		String actual = dto.getProductName();
		assertEquals(expected,actual);
	}
	@Test
	public void test_setProductName_all() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "漢字 テスト　てすと123abc";

		dto.setProductName(expected);
		String actual = dto.getProductName();
		assertEquals(expected,actual);
	}
	// test getProductNameKana()
	@Test
	public void test_getProductNameKana_null() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = null;

		dto.setProductNameKana(expected);
		String actual = dto.getProductNameKana();
		assertEquals(expected,actual);
	}
	@Test
	public void test_getProductNameKana_emptyCharacter() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "";

		dto.setProductNameKana(expected);
		String actual = dto.getProductNameKana();
		assertEquals(expected,actual);
	}
	@Test
	public void test_getProductNameKana_space() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = " ";

		dto.setProductNameKana(expected);
		String actual = dto.getProductNameKana();
		assertEquals(expected,actual);
	}
	@Test
	public void test_getProductNameKana_fullSpace() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "　";

		dto.setProductNameKana(expected);
		String actual = dto.getProductNameKana();
		assertEquals(expected,actual);
	}

	@Test
	public void test_getProductNameKana_alphabeticCharacters() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "abc";

		dto.setProductNameKana(expected);
		String actual = dto.getProductNameKana();
		assertEquals(expected,actual);
	}
	@Test
	public void test_getProductNameKana_halfWidthDigit() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "123";

		dto.setProductNameKana(expected);
		String actual = dto.getProductNameKana();
		assertEquals(expected,actual);
	}
	@Test
	public void test_getProductNameKana_hiragana() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "てすと";

		dto.setProductNameKana(expected);
		String actual = dto.getProductNameKana();
		assertEquals(expected,actual);
	}
	@Test
	public void test_getProductNameKana_katakana() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "テスト";

		dto.setProductNameKana(expected);
		String actual = dto.getProductNameKana();
		assertEquals(expected,actual);
	}
	@Test
	public void test_getProductNameKana_kanji() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "漢字";

		dto.setProductNameKana(expected);
		String actual = dto.getProductNameKana();
		assertEquals(expected,actual);
	}
	@Test
	public void test_getProductNameKana_all() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "漢字 テスト　てすと123abc";

		dto.setProductNameKana(expected);
		String actual = dto.getProductNameKana();
		assertEquals(expected,actual);
	}

	// test setProductNameKana()
	@Test
	public void test_setProductNameKana_null() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = null;

		dto.setProductNameKana(expected);
		String actual = dto.getProductNameKana();
		assertEquals(expected,actual);
	}
	@Test
	public void test_setProductNameKana_emptyCharacter() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "";

		dto.setProductNameKana(expected);
		String actual = dto.getProductNameKana();
		assertEquals(expected,actual);
	}
	@Test
	public void test_setProductNameKana_space() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = " ";

		dto.setProductNameKana(expected);
		String actual = dto.getProductNameKana();
		assertEquals(expected,actual);
	}
	@Test
	public void test_setProductNameKana_fullSpace() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "　";

		dto.setProductNameKana(expected);
		String actual = dto.getProductNameKana();
		assertEquals(expected,actual);
	}

	@Test
	public void test_setProductNameKana_alphabeticCharacters() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "abc";

		dto.setProductNameKana(expected);
		String actual = dto.getProductNameKana();
		assertEquals(expected,actual);
	}
	@Test
	public void test_setProductNameKana_halfWidthDigit() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "123";

		dto.setProductNameKana(expected);
		String actual = dto.getProductNameKana();
		assertEquals(expected,actual);
	}
	@Test
	public void test_setProductNameKana_hiragana() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "てすと";

		dto.setProductNameKana(expected);
		String actual = dto.getProductNameKana();
		assertEquals(expected,actual);
	}
	@Test
	public void test_setProductNameKana_katakana() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "テスト";

		dto.setProductNameKana(expected);
		String actual = dto.getProductNameKana();
		assertEquals(expected,actual);
	}
	@Test
	public void test_setProductNameKana_kanji() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "漢字";

		dto.setProductNameKana(expected);
		String actual = dto.getProductNameKana();
		assertEquals(expected,actual);
	}
	@Test
	public void test_setProductNameKana_all() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "漢字 テスト　てすと123abc";

		dto.setProductNameKana(expected);
		String actual = dto.getProductNameKana();
		assertEquals(expected,actual);
	}
	// test getProductDescription()
	@Test
	public void test_getProductDescription_null() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = null;

		dto.setProductDescription(expected);
		String actual = dto.getProductDescription();
		assertEquals(expected,actual);
	}
	@Test
	public void test_getProductDescription_emptyCharacter() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "";

		dto.setProductDescription(expected);
		String actual = dto.getProductDescription();
		assertEquals(expected,actual);
	}
	@Test
	public void test_getProductDescription_space() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = " ";

		dto.setProductDescription(expected);
		String actual = dto.getProductDescription();
		assertEquals(expected,actual);
	}
	@Test
	public void test_getProductDescription_fullSpace() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "　";

		dto.setProductDescription(expected);
		String actual = dto.getProductDescription();
		assertEquals(expected,actual);
	}

	@Test
	public void test_getProductDescription_alphabeticCharacters() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "abc";

		dto.setProductDescription(expected);
		String actual = dto.getProductDescription();
		assertEquals(expected,actual);
	}
	@Test
	public void test_getProductDescription_halfWidthDigit() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "123";

		dto.setProductDescription(expected);
		String actual = dto.getProductDescription();
		assertEquals(expected,actual);
	}
	@Test
	public void test_getProductDescription_hiragana() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "てすと";

		dto.setProductDescription(expected);
		String actual = dto.getProductDescription();
		assertEquals(expected,actual);
	}
	@Test
	public void test_getProductDescription_katakana() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "テスト";

		dto.setProductDescription(expected);
		String actual = dto.getProductDescription();
		assertEquals(expected,actual);
	}
	@Test
	public void test_getProductDescription_kanji() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "漢字";

		dto.setProductDescription(expected);
		String actual = dto.getProductDescription();
		assertEquals(expected,actual);
	}
	@Test
	public void test_getProductDescription_all() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "漢字 テスト　てすと123abc";

		dto.setProductDescription(expected);
		String actual = dto.getProductDescription();
		assertEquals(expected,actual);
	}

	// test setProductDescription()
	@Test
	public void test_setProductDescription_null() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = null;

		dto.setProductDescription(expected);
		String actual = dto.getProductDescription();
		assertEquals(expected,actual);
	}
	@Test
	public void test_setProductDescription_emptyCharacter() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "";

		dto.setProductDescription(expected);
		String actual = dto.getProductDescription();
		assertEquals(expected,actual);
	}
	@Test
	public void test_setProductDescription_space() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = " ";

		dto.setProductDescription(expected);
		String actual = dto.getProductDescription();
		assertEquals(expected,actual);
	}
	@Test
	public void test_setProductDescription_fullSpace() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "　";

		dto.setProductDescription(expected);
		String actual = dto.getProductDescription();
		assertEquals(expected,actual);
	}

	@Test
	public void test_setProductDescription_alphabeticCharacters() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "abc";

		dto.setProductDescription(expected);
		String actual = dto.getProductDescription();
		assertEquals(expected,actual);
	}
	@Test
	public void test_setProductDescription_halfWidthDigit() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "123";

		dto.setProductDescription(expected);
		String actual = dto.getProductDescription();
		assertEquals(expected,actual);
	}
	@Test
	public void test_setProductDescription_hiragana() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "てすと";

		dto.setProductDescription(expected);
		String actual = dto.getProductDescription();
		assertEquals(expected,actual);
	}
	@Test
	public void test_setProductDescription_katakana() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "テスト";

		dto.setProductDescription(expected);
		String actual = dto.getProductDescription();
		assertEquals(expected,actual);
	}
	@Test
	public void test_setProductDescription_kanji() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "漢字";

		dto.setProductDescription(expected);
		String actual = dto.getProductDescription();
		assertEquals(expected,actual);
	}
	@Test
	public void test_setProductDescription_all() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "漢字 テスト　てすと123abc";

		dto.setProductDescription(expected);
		String actual = dto.getProductDescription();
		assertEquals(expected,actual);
	}
	// test getCategoryId()
	@Test
	public void test_getgetCategoryId_null() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = null;

		dto.setCategoryId(expected);
		String actual = dto.getCategoryId();
		assertEquals(expected,actual);
	}
	@Test
	public void test_getCategoryId_emptyCharacter() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "";

		dto.setCategoryId(expected);
		String actual = dto.getCategoryId();
		assertEquals(expected,actual);
	}
	@Test
	public void test_getCategoryId_space() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = " ";

		dto.setCategoryId(expected);
		String actual = dto.getCategoryId();
		assertEquals(expected,actual);
	}
	@Test
	public void test_getCategoryId_fullSpace() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "　";

		dto.setCategoryId(expected);
		String actual = dto.getCategoryId();
		assertEquals(expected,actual);
	}

	@Test
	public void test_getCategoryId_alphabeticCharacters() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "abc";

		dto.setCategoryId(expected);
		String actual = dto.getCategoryId();
		assertEquals(expected,actual);
	}
	@Test
	public void test_getCategoryId_halfWidthDigit() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "123";

		dto.setCategoryId(expected);
		String actual = dto.getCategoryId();
		assertEquals(expected,actual);
	}
	@Test
	public void test_getCategoryId_hiragana() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "てすと";

		dto.setCategoryId(expected);
		String actual = dto.getCategoryId();
		assertEquals(expected,actual);
	}
	@Test
	public void test_getCategoryId_katakana() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "テスト";

		dto.setCategoryId(expected);
		String actual = dto.getCategoryId();
		assertEquals(expected,actual);
	}
	@Test
	public void test_getCategoryId_kanji() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "漢字";

		dto.setCategoryId(expected);
		String actual = dto.getCategoryId();
		assertEquals(expected,actual);
	}
	@Test
	public void test_getCategoryId_all() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "漢字 テスト　てすと123abc";

		dto.setCategoryId(expected);
		String actual = dto.getCategoryId();
		assertEquals(expected,actual);
	}

	// test setProductDescription()
	@Test
	public void test_setCategoryId_null() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = null;

		dto.setCategoryId(expected);
		String actual = dto.getCategoryId();
		assertEquals(expected,actual);
	}
	@Test
	public void test_setCategoryId_emptyCharacter() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "";

		dto.setCategoryId(expected);
		String actual = dto.getCategoryId();
		assertEquals(expected,actual);
	}
	@Test
	public void test_setCategoryId_space() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = " ";

		dto.setCategoryId(expected);
		String actual = dto.getCategoryId();
		assertEquals(expected,actual);
	}
	@Test
	public void test_setCategoryId_fullSpace() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "　";

		dto.setCategoryId(expected);
		String actual = dto.getCategoryId();
		assertEquals(expected,actual);
	}

	@Test
	public void test_setCategoryId_alphabeticCharacters() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "abc";

		dto.setCategoryId(expected);
		String actual = dto.getCategoryId();
		assertEquals(expected,actual);
	}
	@Test
	public void test_setCategoryId_halfWidthDigit() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "123";

		dto.setCategoryId(expected);
		String actual = dto.getCategoryId();
		assertEquals(expected,actual);
	}
	@Test
	public void test_setCategoryId_hiragana() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "てすと";

		dto.setCategoryId(expected);
		String actual = dto.getCategoryId();
		assertEquals(expected,actual);
	}
	@Test
	public void test_setCategoryId_katakana() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "テスト";

		dto.setCategoryId(expected);
		String actual = dto.getCategoryId();
		assertEquals(expected,actual);
	}
	@Test
	public void test_setCategoryId_kanji() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "漢字";

		dto.setCategoryId(expected);
		String actual = dto.getCategoryId();
		assertEquals(expected,actual);
	}
	@Test
	public void test_setCategoryId_all() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "漢字 テスト　てすと123abc";

		dto.setCategoryId(expected);
		String actual = dto.getCategoryId();
		assertEquals(expected,actual);
	}
	// test getPrice()
	@Test
	public void test_getPrice_null() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = null;

		dto.setPrice(expected);
		String actual = dto.getPrice();
		assertEquals(expected,actual);
	}
	@Test
	public void test_getPrice_emptyCharacter() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "";

		dto.setPrice(expected);
		String actual = dto.getPrice();
		assertEquals(expected,actual);
	}
	@Test
	public void test_getPrice_space() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = " ";

		dto.setPrice(expected);
		String actual = dto.getPrice();
		assertEquals(expected,actual);
	}
	@Test
	public void test_getPrice_fullSpace() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "　";

		dto.setPrice(expected);
		String actual = dto.getPrice();
		assertEquals(expected,actual);
	}

	@Test
	public void test_getPrice_alphabeticCharacters() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "abc";

		dto.setPrice(expected);
		String actual = dto.getPrice();
		assertEquals(expected,actual);
	}
	@Test
	public void test_getPrice_halfWidthDigit() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "123";

		dto.setPrice(expected);
		String actual = dto.getPrice();
		assertEquals(expected,actual);
	}
	@Test
	public void test_getPrice_hiragana() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "てすと";

		dto.setPrice(expected);
		String actual = dto.getPrice();
		assertEquals(expected,actual);
	}
	@Test
	public void test_getPrice_katakana() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "テスト";

		dto.setPrice(expected);
		String actual = dto.getPrice();
		assertEquals(expected,actual);
	}
	@Test
	public void test_getPrice_kanji() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "漢字";

		dto.setPrice(expected);
		String actual = dto.getPrice();
		assertEquals(expected,actual);
	}
	@Test
	public void test_getPrice_all() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "漢字 テスト　てすと123abc";

		dto.setPrice(expected);
		String actual = dto.getPrice();
		assertEquals(expected,actual);
	}

	// test setPrice()
	@Test
	public void test_setPrice_null() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = null;

		dto.setPrice(expected);
		String actual = dto.getPrice();
		assertEquals(expected,actual);
	}
	@Test
	public void test_setPrice_emptyCharacter() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "";

		dto.setPrice(expected);
		String actual = dto.getPrice();
		assertEquals(expected,actual);
	}
	@Test
	public void test_setPrice_space() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = " ";

		dto.setPrice(expected);
		String actual = dto.getPrice();
		assertEquals(expected,actual);
	}
	@Test
	public void test_setPrice_fullSpace() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "　";

		dto.setPrice(expected);
		String actual = dto.getPrice();
		assertEquals(expected,actual);
	}

	@Test
	public void test_setPrice_alphabeticCharacters() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "abc";

		dto.setPrice(expected);
		String actual = dto.getPrice();
		assertEquals(expected,actual);
	}
	@Test
	public void test_setPrice_halfWidthDigit() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "123";

		dto.setPrice(expected);
		String actual = dto.getPrice();
		assertEquals(expected,actual);
	}
	@Test
	public void test_setPrice_hiragana() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "てすと";

		dto.setPrice(expected);
		String actual = dto.getPrice();
		assertEquals(expected,actual);
	}
	@Test
	public void test_setPrice_katakana() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "テスト";

		dto.setPrice(expected);
		String actual = dto.getPrice();
		assertEquals(expected,actual);
	}
	@Test
	public void test_setPrice_kanji() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "漢字";

		dto.setPrice(expected);
		String actual = dto.getPrice();
		assertEquals(expected,actual);
	}
	@Test
	public void test_setPrice_all() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "漢字 テスト　てすと123abc";

		dto.setPrice(expected);
		String actual = dto.getPrice();
		assertEquals(expected,actual);
	}
	// test getImageFilePath()
	@Test
	public void test_getImageFilePath_null() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = null;

		dto.setImageFilePath(expected);
		String actual = dto.getImageFilePath();
		assertEquals(expected,actual);
	}
	@Test
	public void test_getImageFilePath_emptyCharacter() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "";

		dto.setImageFilePath(expected);
		String actual = dto.getImageFilePath();
		assertEquals(expected,actual);
	}
	@Test
	public void test_getImageFilePath_space() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = " ";

		dto.setImageFilePath(expected);
		String actual = dto.getImageFilePath();
		assertEquals(expected,actual);
	}
	@Test
	public void test_getImageFilePath_fullSpace() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "　";

		dto.setImageFilePath(expected);
		String actual = dto.getImageFilePath();
		assertEquals(expected,actual);
	}

	@Test
	public void test_getImageFilePath_alphabeticCharacters() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "abc";

		dto.setImageFilePath(expected);
		String actual = dto.getImageFilePath();
		assertEquals(expected,actual);
	}
	@Test
	public void test_getImageFilePath_halfWidthDigit() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "123";

		dto.setImageFilePath(expected);
		String actual = dto.getImageFilePath();
		assertEquals(expected,actual);
	}
	@Test
	public void test_getImageFilePath_hiragana() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "てすと";

		dto.setImageFilePath(expected);
		String actual = dto.getImageFilePath();
		assertEquals(expected,actual);
	}
	@Test
	public void test_getImageFilePath_katakana() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "テスト";

		dto.setImageFilePath(expected);
		String actual = dto.getImageFilePath();
		assertEquals(expected,actual);
	}
	@Test
	public void test_getImageFilePath_kanji() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "漢字";

		dto.setImageFilePath(expected);
		String actual = dto.getImageFilePath();
		assertEquals(expected,actual);
	}
	@Test
	public void test_getImageFilePath_all() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "漢字 テスト　てすと123abc";

		dto.setImageFilePath(expected);
		String actual = dto.getImageFilePath();
		assertEquals(expected,actual);
	}

	// test setImageFilePath()
	@Test
	public void test_setImageFilePath_null() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = null;

		dto.setImageFilePath(expected);
		String actual = dto.getImageFilePath();
		assertEquals(expected,actual);
	}
	@Test
	public void test_setImageFilePath_emptyCharacter() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "";

		dto.setImageFilePath(expected);
		String actual = dto.getImageFilePath();
		assertEquals(expected,actual);
	}
	@Test
	public void test_setImageFilePath_space() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = " ";

		dto.setImageFilePath(expected);
		String actual = dto.getImageFilePath();
		assertEquals(expected,actual);
	}
	@Test
	public void test_setImageFilePath_fullSpace() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "　";

		dto.setImageFilePath(expected);
		String actual = dto.getImageFilePath();
		assertEquals(expected,actual);
	}

	@Test
	public void test_setImageFilePath_alphabeticCharacters() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "abc";

		dto.setImageFilePath(expected);
		String actual = dto.getImageFilePath();
		assertEquals(expected,actual);
	}
	@Test
	public void test_setImageFilePath_halfWidthDigit() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "123";

		dto.setImageFilePath(expected);
		String actual = dto.getImageFilePath();
		assertEquals(expected,actual);
	}
	@Test
	public void test_setImageFilePath_hiragana() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "てすと";

		dto.setImageFilePath(expected);
		String actual = dto.getImageFilePath();
		assertEquals(expected,actual);
	}
	@Test
	public void test_setImageFilePath_katakana() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "テスト";

		dto.setImageFilePath(expected);
		String actual = dto.getImageFilePath();
		assertEquals(expected,actual);
	}
	@Test
	public void test_setImageFilePath_kanji() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "漢字";

		dto.setImageFilePath(expected);
		String actual = dto.getImageFilePath();
		assertEquals(expected,actual);
	}
	@Test
	public void test_setImageFilePath_all() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "漢字 テスト　てすと123abc";

		dto.setImageFilePath(expected);
		String actual = dto.getImageFilePath();
		assertEquals(expected,actual);
	}

	// test getImageFileName()
	@Test
	public void test_getImageFileName_null() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = null;

		dto.setImageFileName(expected);
		String actual = dto.getImageFileName();
		assertEquals(expected,actual);
	}
	@Test
	public void test_getImageFileName_emptyCharacter() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "";

		dto.setImageFileName(expected);
		String actual = dto.getImageFileName();
		assertEquals(expected,actual);
	}
	@Test
	public void test_getImageFileName_space() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = " ";

		dto.setImageFileName(expected);
		String actual = dto.getImageFileName();
		assertEquals(expected,actual);
	}
	@Test
	public void test_getImageFileName_fullSpace() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "　";

		dto.setImageFileName(expected);
		String actual = dto.getImageFileName();
		assertEquals(expected,actual);
	}

	@Test
	public void test_getImageFileName_alphabeticCharacters() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "abc";

		dto.setImageFileName(expected);
		String actual = dto.getImageFileName();
		assertEquals(expected,actual);
	}
	@Test
	public void test_getImageFileName_halfWidthDigit() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "123";

		dto.setImageFileName(expected);
		String actual = dto.getImageFileName();
		assertEquals(expected,actual);
	}
	@Test
	public void test_getImageFileName_hiragana() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "てすと";

		dto.setImageFileName(expected);
		String actual = dto.getImageFileName();
		assertEquals(expected,actual);
	}
	@Test
	public void test_getImageFileName_katakana() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "テスト";

		dto.setImageFileName(expected);
		String actual = dto.getImageFileName();
		assertEquals(expected,actual);
	}
	@Test
	public void test_getImageFileName_kanji() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "漢字";

		dto.setImageFileName(expected);
		String actual = dto.getImageFileName();
		assertEquals(expected,actual);
	}
	@Test
	public void test_getImageFileName_all() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "漢字 テスト　てすと123abc";

		dto.setImageFileName(expected);
		String actual = dto.getImageFileName();
		assertEquals(expected,actual);
	}

	// test setImageFileName()
	@Test
	public void test_setImageFileName_null() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = null;

		dto.setImageFileName(expected);
		String actual = dto.getImageFileName();
		assertEquals(expected,actual);
	}
	@Test
	public void test_setImageFileName_emptyCharacter() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "";

		dto.setImageFileName(expected);
		String actual = dto.getImageFileName();
		assertEquals(expected,actual);
	}
	@Test
	public void test_setImageFileName_space() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = " ";

		dto.setImageFileName(expected);
		String actual = dto.getImageFileName();
		assertEquals(expected,actual);
	}
	@Test
	public void test_setImageFileName_fullSpace() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "　";

		dto.setImageFileName(expected);
		String actual = dto.getImageFileName();
		assertEquals(expected,actual);
	}

	@Test
	public void test_setImageFileName_alphabeticCharacters() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "abc";

		dto.setImageFileName(expected);
		String actual = dto.getImageFileName();
		assertEquals(expected,actual);
	}
	@Test
	public void test_setImageFileName_halfWidthDigit() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "123";

		dto.setImageFileName(expected);
		String actual = dto.getImageFileName();
		assertEquals(expected,actual);
	}
	@Test
	public void test_setImageFileName_hiragana() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "てすと";

		dto.setImageFileName(expected);
		String actual = dto.getImageFileName();
		assertEquals(expected,actual);
	}
	@Test
	public void test_setImageFileName_katakana() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "テスト";

		dto.setImageFileName(expected);
		String actual = dto.getImageFileName();
		assertEquals(expected,actual);
	}
	@Test
	public void test_setImageFileName_kanji() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "漢字";

		dto.setImageFileName(expected);
		String actual = dto.getImageFileName();
		assertEquals(expected,actual);
	}
	@Test
	public void test_setImageFileName_all() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "漢字 テスト　てすと123abc";

		dto.setImageFileName(expected);
		String actual = dto.getImageFileName();
		assertEquals(expected,actual);
	}
	// test getImageFile()
	@Test
	public void test_getImageFile_null() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = null;

		dto.setImageFile(expected);
		String actual = dto.getImageFile();
		assertEquals(expected,actual);
	}
	@Test
	public void test_getImageFile_emptyCharacter() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "";

		dto.setImageFile(expected);
		String actual = dto.getImageFile();
		assertEquals(expected,actual);
	}
	@Test
	public void test_getImageFile_space() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = " ";

		dto.setImageFile(expected);
		String actual = dto.getImageFile();
		assertEquals(expected,actual);
	}
	@Test
	public void test_getImageFile_fullSpace() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "　";

		dto.setImageFile(expected);
		String actual = dto.getImageFile();
		assertEquals(expected,actual);
	}

	@Test
	public void test_getImageFile_alphabeticCharacters() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "abc";

		dto.setImageFile(expected);
		String actual = dto.getImageFile();
		assertEquals(expected,actual);
	}
	@Test
	public void test_getImageFile_halfWidthDigit() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "123";

		dto.setImageFile(expected);
		String actual = dto.getImageFile();
		assertEquals(expected,actual);
	}
	@Test
	public void test_getImageFile_hiragana() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "てすと";

		dto.setImageFile(expected);
		String actual = dto.getImageFile();
		assertEquals(expected,actual);
	}
	@Test
	public void test_getImageFile_katakana() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "テスト";

		dto.setImageFile(expected);
		String actual = dto.getImageFile();
		assertEquals(expected,actual);
	}
	@Test
	public void test_getImageFile_kanji() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "漢字";

		dto.setImageFile(expected);
		String actual = dto.getImageFile();
		assertEquals(expected,actual);
	}
	@Test
	public void test_getImageFile_all() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "漢字 テスト　てすと123abc";

		dto.setImageFile(expected);
		String actual = dto.getImageFile();
		assertEquals(expected,actual);
	}

	// test setImageFile()
	@Test
	public void test_setImageFile_null() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = null;

		dto.setImageFile(expected);
		String actual = dto.getImageFile();
		assertEquals(expected,actual);
	}
	@Test
	public void test_setImageFile_emptyCharacter() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "";

		dto.setImageFile(expected);
		String actual = dto.getImageFile();
		assertEquals(expected,actual);
	}
	@Test
	public void test_setImageFile_space() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = " ";

		dto.setImageFile(expected);
		String actual = dto.getImageFile();
		assertEquals(expected,actual);
	}
	@Test
	public void test_setImageFile_fullSpace() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "　";

		dto.setImageFile(expected);
		String actual = dto.getImageFile();
		assertEquals(expected,actual);
	}

	@Test
	public void test_setImageFile_alphabeticCharacters() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "abc";

		dto.setImageFile(expected);
		String actual = dto.getImageFile();
		assertEquals(expected,actual);
	}
	@Test
	public void test_setImageFile_halfWidthDigit() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "123";

		dto.setImageFile(expected);
		String actual = dto.getImageFile();
		assertEquals(expected,actual);
	}
	@Test
	public void test_setImageFile_hiragana() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "てすと";

		dto.setImageFile(expected);
		String actual = dto.getImageFile();
		assertEquals(expected,actual);
	}
	@Test
	public void test_setImageFile_katakana() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "テスト";

		dto.setImageFile(expected);
		String actual = dto.getImageFile();
		assertEquals(expected,actual);
	}
	@Test
	public void test_setImageFile_kanji() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "漢字";

		dto.setImageFile(expected);
		String actual = dto.getImageFile();
		assertEquals(expected,actual);
	}
	@Test
	public void test_setImageFile_all() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "漢字 テスト　てすと123abc";

		dto.setImageFile(expected);
		String actual = dto.getImageFile();
		assertEquals(expected,actual);
	}
	// test getReleaseDate()
	@Test
	public void test_getReleaseDate_null() {
		ProductInfoDTO dto = new ProductInfoDTO();
		Date expected = null;

		dto.setReleaseDate(expected);
		Date actual = dto.getReleaseDate();
		assertEquals(expected, actual);
	}
	@Test
	public void test_getReleaseDate_date() {
		ProductInfoDTO dto = new ProductInfoDTO();

		SimpleDateFormat sdf= new SimpleDateFormat("yyyyMMdd HH:mm:ss");
		Date expected;
		try {
			expected = sdf.parse("20180420 12:00:00");
			dto.setReleaseDate(expected);
			assertEquals(expected, dto.getReleaseDate());
		} catch (ParseException e) {
			fail();
		}
	}
	// test setReleaseDate()
	@Test
	public void test_setReleaseDate_null() {
		ProductInfoDTO dto = new ProductInfoDTO();
		Date expected = null;

		dto.setReleaseDate(expected);
		Date actual = dto.getReleaseDate();
		assertEquals(expected, actual);
	}
	@Test
	public void test_setReleaseDate_date() {
		ProductInfoDTO dto = new ProductInfoDTO();

		SimpleDateFormat sdf= new SimpleDateFormat("yyyyMMdd HH:mm:ss");
		Date expected;
		try {
			expected = sdf.parse("20180420 12:00:00");
			dto.setReleaseDate(expected);
			assertEquals(expected, dto.getReleaseDate());
		} catch (ParseException e) {
			fail();
		}
	}

	// test getReleaseCompany()
	@Test
	public void test_getReleaseCompany_null() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = null;

		dto.setReleaseCompany(expected);
		String actual = dto.getReleaseCompany();
		assertEquals(expected,actual);
	}
	@Test
	public void test_getReleaseCompany_emptyCharacter() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "";

		dto.setReleaseCompany(expected);
		String actual = dto.getReleaseCompany();
		assertEquals(expected,actual);
	}
	@Test
	public void test_getReleaseCompany_space() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = " ";

		dto.setReleaseCompany(expected);
		String actual = dto.getReleaseCompany();
		assertEquals(expected,actual);
	}
	@Test
	public void test_getReleaseCompany_fullSpace() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "　";

		dto.setReleaseCompany(expected);
		String actual = dto.getReleaseCompany();
		assertEquals(expected,actual);
	}

	@Test
	public void test_getReleaseCompany_alphabeticCharacters() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "abc";

		dto.setReleaseCompany(expected);
		String actual = dto.getReleaseCompany();
		assertEquals(expected,actual);
	}
	@Test
	public void test_getReleaseCompany_halfWidthDigit() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "123";

		dto.setReleaseCompany(expected);
		String actual = dto.getReleaseCompany();
		assertEquals(expected,actual);
	}
	@Test
	public void test_getReleaseCompany_hiragana() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "てすと";

		dto.setReleaseCompany(expected);
		String actual = dto.getReleaseCompany();
		assertEquals(expected,actual);
	}
	@Test
	public void test_getReleaseCompany_katakana() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "テスト";

		dto.setReleaseCompany(expected);
		String actual = dto.getReleaseCompany();
		assertEquals(expected,actual);
	}
	@Test
	public void test_getReleaseCompany_kanji() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "漢字";

		dto.setReleaseCompany(expected);
		String actual = dto.getReleaseCompany();
		assertEquals(expected,actual);
	}
	@Test
	public void test_getReleaseCompany_all() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "漢字 テスト　てすと123abc";

		dto.setReleaseCompany(expected);
		String actual = dto.getReleaseCompany();
		assertEquals(expected,actual);
	}

	// test setReleaseCompany()
	@Test
	public void test_setReleaseCompany_null() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = null;

		dto.setReleaseCompany(expected);
		String actual = dto.getReleaseCompany();
		assertEquals(expected,actual);
	}
	@Test
	public void test_setReleaseCompany_emptyCharacter() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "";

		dto.setReleaseCompany(expected);
		String actual = dto.getReleaseCompany();
		assertEquals(expected,actual);
	}
	@Test
	public void test_setReleaseCompany_space() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = " ";

		dto.setReleaseCompany(expected);
		String actual = dto.getReleaseCompany();
		assertEquals(expected,actual);
	}
	@Test
	public void test_setReleaseCompany_fullSpace() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "　";

		dto.setReleaseCompany(expected);
		String actual = dto.getReleaseCompany();
		assertEquals(expected,actual);
	}

	@Test
	public void test_setReleaseCompany_alphabeticCharacters() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "abc";

		dto.setReleaseCompany(expected);
		String actual = dto.getReleaseCompany();
		assertEquals(expected,actual);
	}
	@Test
	public void test_setReleaseCompany_halfWidthDigit() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "123";

		dto.setReleaseCompany(expected);
		String actual = dto.getReleaseCompany();
		assertEquals(expected,actual);
	}
	@Test
	public void test_setReleaseCompany_hiragana() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "てすと";

		dto.setReleaseCompany(expected);
		String actual = dto.getReleaseCompany();
		assertEquals(expected,actual);
	}
	@Test
	public void test_setReleaseCompany_katakana() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "テスト";

		dto.setReleaseCompany(expected);
		String actual = dto.getReleaseCompany();
		assertEquals(expected,actual);
	}
	@Test
	public void test_setReleaseCompany_kanji() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "漢字";

		dto.setReleaseCompany(expected);
		String actual = dto.getReleaseCompany();
		assertEquals(expected,actual);
	}
	@Test
	public void test_setReleaseCompany_all() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "漢字 テスト　てすと123abc";

		dto.setReleaseCompany(expected);
		String actual = dto.getReleaseCompany();
		assertEquals(expected,actual);
	}

	// test getStatus()
	@Test
	public void test_getStatus_null() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = null;

		dto.setStatus(expected);
		String actual = dto.getStatus();
		assertEquals(expected,actual);
	}
	@Test
	public void test_getStatus_emptyCharacter() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "";

		dto.setStatus(expected);
		String actual = dto.getStatus();
		assertEquals(expected,actual);
	}
	@Test
	public void test_getStatus_space() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = " ";

		dto.setStatus(expected);
		String actual = dto.getStatus();
		assertEquals(expected,actual);
	}
	@Test
	public void test_getStatus_fullSpace() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "　";

		dto.setStatus(expected);
		String actual = dto.getStatus();
		assertEquals(expected,actual);
	}

	@Test
	public void test_getStatus_alphabeticCharacters() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "abc";

		dto.setStatus(expected);
		String actual = dto.getStatus();
		assertEquals(expected,actual);
	}
	@Test
	public void test_getStatus_halfWidthDigit() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "123";

		dto.setStatus(expected);
		String actual = dto.getStatus();
		assertEquals(expected,actual);
	}
	@Test
	public void test_getStatus_hiragana() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "てすと";

		dto.setStatus(expected);
		String actual = dto.getStatus();
		assertEquals(expected,actual);
	}
	@Test
	public void test_getStatus_katakana() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "テスト";

		dto.setStatus(expected);
		String actual = dto.getStatus();
		assertEquals(expected,actual);
	}
	@Test
	public void test_getStatus_kanji() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "漢字";

		dto.setStatus(expected);
		String actual = dto.getStatus();
		assertEquals(expected,actual);
	}
	@Test
	public void test_getStatus_all() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "漢字 テスト　てすと123abc";

		dto.setStatus(expected);
		String actual = dto.getStatus();
		assertEquals(expected,actual);
	}

	// test setStatus()
	@Test
	public void test_setStatus_null() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = null;

		dto.setStatus(expected);
		String actual = dto.getStatus();
		assertEquals(expected,actual);
	}
	@Test
	public void test_setStatus_emptyCharacter() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "";

		dto.setStatus(expected);
		String actual = dto.getStatus();
		assertEquals(expected,actual);
	}
	@Test
	public void test_setStatus_space() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = " ";

		dto.setStatus(expected);
		String actual = dto.getStatus();
		assertEquals(expected,actual);
	}
	@Test
	public void test_setStatus_fullSpace() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "　";

		dto.setStatus(expected);
		String actual = dto.getStatus();
		assertEquals(expected,actual);
	}

	@Test
	public void test_setStatus_alphabeticCharacters() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "abc";

		dto.setStatus(expected);
		String actual = dto.getStatus();
		assertEquals(expected,actual);
	}
	@Test
	public void test_setStatus_halfWidthDigit() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "123";

		dto.setStatus(expected);
		String actual = dto.getStatus();
		assertEquals(expected,actual);
	}
	@Test
	public void test_setStatus_hiragana() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "てすと";

		dto.setStatus(expected);
		String actual = dto.getStatus();
		assertEquals(expected,actual);
	}
	@Test
	public void test_setStatus_katakana() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "テスト";

		dto.setStatus(expected);
		String actual = dto.getStatus();
		assertEquals(expected,actual);
	}
	@Test
	public void test_setStatus_kanji() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "漢字";

		dto.setStatus(expected);
		String actual = dto.getStatus();
		assertEquals(expected,actual);
	}
	@Test
	public void test_setStatus_all() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "漢字 テスト　てすと123abc";

		dto.setStatus(expected);
		String actual = dto.getStatus();
		assertEquals(expected,actual);
	}

	// test getRegistDate()
	@Test
	public void test_getRegistDate_null() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = null;

		dto.setRegistDate(expected);
		String actual = dto.getRegistDate();
		assertEquals(expected,actual);
	}
	@Test
	public void test_getRegistDate_emptyCharacter() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "";

		dto.setRegistDate(expected);
		String actual = dto.getRegistDate();
		assertEquals(expected,actual);
	}
	@Test
	public void test_getRegistDate_space() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = " ";

		dto.setRegistDate(expected);
		String actual = dto.getRegistDate();
		assertEquals(expected,actual);
	}
	@Test
	public void test_getRegistDate_fullSpace() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "　";

		dto.setRegistDate(expected);
		String actual = dto.getRegistDate();
		assertEquals(expected,actual);
	}

	@Test
	public void test_getRegistDate_alphabeticCharacters() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "abc";

		dto.setRegistDate(expected);
		String actual = dto.getRegistDate();
		assertEquals(expected,actual);
	}
	@Test
	public void test_getRegistDate_halfWidthDigit() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "123";

		dto.setRegistDate(expected);
		String actual = dto.getRegistDate();
		assertEquals(expected,actual);
	}
	@Test
	public void test_getRegistDate_hiragana() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "てすと";

		dto.setRegistDate(expected);
		String actual = dto.getRegistDate();
		assertEquals(expected,actual);
	}
	@Test
	public void test_getRegistDate_katakana() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "テスト";

		dto.setRegistDate(expected);
		String actual = dto.getRegistDate();
		assertEquals(expected,actual);
	}
	@Test
	public void test_getRegistDate_kanji() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "漢字";

		dto.setRegistDate(expected);
		String actual = dto.getRegistDate();
		assertEquals(expected,actual);
	}
	@Test
	public void test_getRegistDate_all() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "漢字 テスト　てすと123abc";

		dto.setRegistDate(expected);
		String actual = dto.getRegistDate();
		assertEquals(expected,actual);
	}

	// test setRegistDate()
	@Test
	public void test_setRegistDate_null() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = null;

		dto.setRegistDate(expected);
		String actual = dto.getRegistDate();
		assertEquals(expected,actual);
	}
	@Test
	public void test_setRegistDate_emptyCharacter() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "";

		dto.setRegistDate(expected);
		String actual = dto.getRegistDate();
		assertEquals(expected,actual);
	}
	@Test
	public void test_setRegistDate_space() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = " ";

		dto.setRegistDate(expected);
		String actual = dto.getRegistDate();
		assertEquals(expected,actual);
	}
	@Test
	public void test_setRegistDate_fullSpace() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "　";

		dto.setRegistDate(expected);
		String actual = dto.getRegistDate();
		assertEquals(expected,actual);
	}

	@Test
	public void test_setRegistDate_alphabeticCharacters() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "abc";

		dto.setRegistDate(expected);
		String actual = dto.getRegistDate();
		assertEquals(expected,actual);
	}
	@Test
	public void test_setRegistDate_halfWidthDigit() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "123";

		dto.setRegistDate(expected);
		String actual = dto.getRegistDate();
		assertEquals(expected,actual);
	}
	@Test
	public void test_setRegistDate_hiragana() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "てすと";

		dto.setRegistDate(expected);
		String actual = dto.getRegistDate();
		assertEquals(expected,actual);
	}
	@Test
	public void test_setRegistDate_katakana() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "テスト";

		dto.setRegistDate(expected);
		String actual = dto.getRegistDate();
		assertEquals(expected,actual);
	}
	@Test
	public void test_setRegistDate_kanji() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "漢字";

		dto.setRegistDate(expected);
		String actual = dto.getRegistDate();
		assertEquals(expected,actual);
	}
	@Test
	public void test_setRegistDate_all() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "漢字 テスト　てすと123abc";

		dto.setRegistDate(expected);
		String actual = dto.getRegistDate();
		assertEquals(expected,actual);
	}

	// test getUpdateDate()
	@Test
	public void test_getUpdateDate_null() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = null;

		dto.setUpdateDate(expected);
		String actual = dto.getUpdateDate();
		assertEquals(expected,actual);
	}
	@Test
	public void test_getUpdateDate_emptyCharacter() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "";

		dto.setUpdateDate(expected);
		String actual = dto.getUpdateDate();
		assertEquals(expected,actual);
	}
	@Test
	public void test_getUpdateDate_space() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = " ";

		dto.setUpdateDate(expected);
		String actual = dto.getUpdateDate();
		assertEquals(expected,actual);
	}
	@Test
	public void test_getUpdateDate_fullSpace() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "　";

		dto.setUpdateDate(expected);
		String actual = dto.getUpdateDate();
		assertEquals(expected,actual);
	}

	@Test
	public void test_getUpdateDate_alphabeticCharacters() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "abc";

		dto.setUpdateDate(expected);
		String actual = dto.getUpdateDate();
		assertEquals(expected,actual);
	}
	@Test
	public void test_getUpdateDate_halfWidthDigit() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "123";

		dto.setUpdateDate(expected);
		String actual = dto.getUpdateDate();
		assertEquals(expected,actual);
	}
	@Test
	public void test_getUpdateDate_hiragana() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "てすと";

		dto.setUpdateDate(expected);
		String actual = dto.getUpdateDate();
		assertEquals(expected,actual);
	}
	@Test
	public void test_getUpdateDate_katakana() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "テスト";

		dto.setUpdateDate(expected);
		String actual = dto.getUpdateDate();
		assertEquals(expected,actual);
	}
	@Test
	public void test_getUpdateDate_kanji() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "漢字";

		dto.setUpdateDate(expected);
		String actual = dto.getUpdateDate();
		assertEquals(expected,actual);
	}
	@Test
	public void test_getUpdateDate_all() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "漢字 テスト　てすと123abc";

		dto.setUpdateDate(expected);
		String actual = dto.getUpdateDate();
		assertEquals(expected,actual);
	}

	// test setUpdateDate()
	@Test
	public void test_setUpdateDate_null() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = null;

		dto.setUpdateDate(expected);
		String actual = dto.getUpdateDate();
		assertEquals(expected,actual);
	}
	@Test
	public void test_setUpdateDate_emptyCharacter() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "";

		dto.setUpdateDate(expected);
		String actual = dto.getUpdateDate();
		assertEquals(expected,actual);
	}
	@Test
	public void test_setUpdateDate_space() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = " ";

		dto.setUpdateDate(expected);
		String actual = dto.getUpdateDate();
		assertEquals(expected,actual);
	}
	@Test
	public void test_setUpdateDate_fullSpace() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "　";

		dto.setUpdateDate(expected);
		String actual = dto.getUpdateDate();
		assertEquals(expected,actual);
	}

	@Test
	public void tests_setUpdateDate_alphabeticCharacters() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "abc";

		dto.setUpdateDate(expected);
		String actual = dto.getUpdateDate();
		assertEquals(expected,actual);
	}
	@Test
	public void test_setUpdateDate_halfWidthDigit() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "123";

		dto.setUpdateDate(expected);
		String actual = dto.getUpdateDate();
		assertEquals(expected,actual);
	}
	@Test
	public void test_setUpdateDate_hiragana() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "てすと";

		dto.setUpdateDate(expected);
		String actual = dto.getUpdateDate();
		assertEquals(expected,actual);
	}
	@Test
	public void test_setUpdateDate_katakana() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "テスト";

		dto.setUpdateDate(expected);
		String actual = dto.getUpdateDate();
		assertEquals(expected,actual);
	}
	@Test
	public void test_setUpdateDate_kanji() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "漢字";

		dto.setUpdateDate(expected);
		String actual = dto.getUpdateDate();
		assertEquals(expected,actual);
	}
	@Test
	public void test_setUpdateDate_all() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "漢字 テスト　てすと123abc";

		dto.setUpdateDate(expected);
		String actual = dto.getUpdateDate();
		assertEquals(expected,actual);
	}

	// test getStringList()
	@Test
	public void test_getStringList_null() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = null;

		dto.setStringList(expected);
		String actual = dto.getStringList();
		assertEquals(expected,actual);
	}
	@Test
	public void test_getStringList_emptyCharacter() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "";

		dto.setStringList(expected);
		String actual = dto.getStringList();
		assertEquals(expected,actual);
	}
	@Test
	public void test_getStringList_space() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = " ";

		dto.setStringList(expected);
		String actual = dto.getStringList();
		assertEquals(expected,actual);
	}
	@Test
	public void test_getStringList_fullSpace() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "　";

		dto.setStringList(expected);
		String actual = dto.getStringList();
		assertEquals(expected,actual);
	}

	@Test
	public void test_getStringList_alphabeticCharacters() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "abc";

		dto.setStringList(expected);
		String actual = dto.getStringList();
		assertEquals(expected,actual);
	}
	@Test
	public void test_getStringList_halfWidthDigit() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "123";

		dto.setStringList(expected);
		String actual = dto.getStringList();
		assertEquals(expected,actual);
	}
	@Test
	public void test_getStringList_hiragana() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "てすと";

		dto.setStringList(expected);
		String actual = dto.getStringList();
		assertEquals(expected,actual);
	}
	@Test
	public void test_getStringList_katakana() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "テスト";

		dto.setStringList(expected);
		String actual = dto.getStringList();
		assertEquals(expected,actual);
	}
	@Test
	public void test_getStringList_kanji() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "漢字";

		dto.setStringList(expected);
		String actual = dto.getStringList();
		assertEquals(expected,actual);
	}
	@Test
	public void test_getStringList_all() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "漢字 テスト　てすと123abc";

		dto.setStringList(expected);
		String actual = dto.getStringList();
		assertEquals(expected,actual);
	}

	// test setStringList()
	@Test
	public void test_setStringList_null() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = null;

		dto.setStringList(expected);
		String actual = dto.getStringList();
		assertEquals(expected,actual);
	}
	@Test
	public void test_setStringList_emptyCharacter() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "";

		dto.setStringList(expected);
		String actual = dto.getStringList();
		assertEquals(expected,actual);
	}
	@Test
	public void test_setStringList_space() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = " ";

		dto.setStringList(expected);
		String actual = dto.getStringList();
		assertEquals(expected,actual);
	}
	@Test
	public void test_setStringList_fullSpace() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "　";

		dto.setStringList(expected);
		String actual = dto.getStringList();
		assertEquals(expected,actual);
	}

	@Test
	public void test_setStringList_alphabeticCharacters() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "abc";

		dto.setStringList(expected);
		String actual = dto.getStringList();
		assertEquals(expected,actual);
	}
	@Test
	public void test_setStringList_halfWidthDigit() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "123";

		dto.setStringList(expected);
		String actual = dto.getStringList();
		assertEquals(expected,actual);
	}
	@Test
	public void test_setStringList_hiragana() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "てすと";

		dto.setStringList(expected);
		String actual = dto.getStringList();
		assertEquals(expected,actual);
	}
	@Test
	public void test_setStringList_katakana() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "テスト";

		dto.setStringList(expected);
		String actual = dto.getStringList();
		assertEquals(expected,actual);
	}
	@Test
	public void test_setStringList_kanji() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "漢字";

		dto.setStringList(expected);
		String actual = dto.getStringList();
		assertEquals(expected,actual);
	}
	@Test
	public void test_setStringList_all() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "漢字 テスト　てすと123abc";

		dto.setStringList(expected);
		String actual = dto.getStringList();
		assertEquals(expected,actual);
	}

}
