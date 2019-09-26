# -*- coding: utf-8 -*-
import scrapy


class ExampleSpider(scrapy.Spider):
    name = 'example'
    allowed_domains = ['https://github.com/apache/spark']
    start_urls = ['http://https://github.com/apache/spark/']

    def parse(self, response):
        pass
