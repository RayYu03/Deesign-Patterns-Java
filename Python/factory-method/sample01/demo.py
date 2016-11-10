from xml.etree import ElementTree as ET

try:
    tree = ET.parse('configTV.xml')
    root = tree.getroot()
except:
    print('Error: cannot parse file: configTV.xml.')

brandNames = list()

for brand in root.findall('brandName'):
    brandNames.append(brand.text)
print brandNames
