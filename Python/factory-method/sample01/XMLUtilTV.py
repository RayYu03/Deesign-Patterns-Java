from xml.etree import ElementTree as ET

class XMLUtilTV(object):
    @staticmethod
    def getFactoryNames():
        try:
            tree = ET.parse('configTV.xml')
            root = tree.getroot()
        except:
            print('Error: cannot parse file: configTV.xml.')

        factoryNames = list()

        for factory in root.findall('className'):
            factoryNames.append(factory.text)
        return factoryNames
